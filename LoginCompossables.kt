package br.qi.socialmediamanhare

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.qi.socialmediamanhare.ui.theme.SocialmediamanhareTheme

@Composable
fun LogoLogin(
    @DrawableRes logo: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = logo),
        contentDescription = "Logo da tela do login",
        modifier = modifier.height(200.dp)
    )
}

@Composable
fun MyTextField(
    label: String,
    isPassword: Boolean,
    icon: ImageVector
) {
    var textValue by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var hidePass by remember {
        mutableStateOf(true)
    }

    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = {
            Text(text = label)
        },
        leadingIcon = {
            Icon(
                imageVector = icon,
                contentDescription = "icone do campo  de teste"
            )
        },
        trailingIcon = {
            if (isPassword) {
                IconButton(
                    onClick = { hidePass = !hidePass }
                ) {
                    Icon(
                        imageVector = if (hidePass) Icons.Filled.Done else Icons.Filled.Clear,
                        contentDescription = "icone para mostrar senha"

                    )
                }
            } else {
                hidePass = false
            }
        },
        visualTransformation = if(hidePass)
        PasswordVisualTransformation('*')
        else
        VisualTransformation.None


    )// fecha o textfield
}

@Composable
fun MySwitch(
    isChecked: Boolean,
    onChange: (Boolean) -> Unit,
    label: String,
    modifier: Modifier = Modifier
) {
    Row (
        verticalAlignment = Alignment.CenterVertically
    ) {
     Switch(
         checked = isChecked ,
         onCheckedChange = onChange
     )

        Spacer(
            modifier = modifier.width(6.dp)
        )

        Text(
            text = label
        )
    }//row fechando aqui
}
@Composable
fun MySwitchState(
    label: String,
    modifier: Modifier =Modifier
) {
    var switchChange by remember {
        mutableStateOf(false)
    }

    MySwitch(
        isChecked = switchChange,
        onChange = { switchChange = !switchChange },
        label = label
    )
}

@Composable
fun MyButton(
    label: String,
    size: Dp,
    action: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.width(size)
    ) {
        ElevatedButton(
            onClick = action,
            modifier = modifier.fillMaxWidth()
        ) {
             Text(text = label)
        }
    }
}

///////////////////////////////////////////////////////////////

@Preview
@Composable
fun MyTextFieldPreview() {
    SocialmediamanhareTheme {
        MyTextField(
            label = "Senha",
            isPassword = true,
            icon = Icons.Outlined.Lock
        )
    }
}



@Preview
@Composable
fun MySwitchPreview() {
    var isChecked by remember { mutableStateOf(false) } //fi isso aqui e pra ele ja "ligar desligado"

    MySwitch(
        isChecked = isChecked,
        onChange = { isChecked = it },
        label = "Me manter conectado"
    )
}
