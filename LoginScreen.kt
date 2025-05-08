package br.qi.socialmediamanhare.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.qi.socialmediamanhare.LogoLogin
import br.qi.socialmediamanhare.MyButton
import br.qi.socialmediamanhare.MySwitch
import br.qi.socialmediamanhare.MySwitchState
import br.qi.socialmediamanhare.MyTextField
import br.qi.socialmediamanhare.R
import br.qi.socialmediamanhare.ui.theme.SocialmediamanhareTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LogoLogin(
            logo = R.drawable.ic_launcher_foreground
        )

        MyTextField(
            label = "Usuário",
            isPassword = false,
            icon = Icons.Outlined.Person
        )

        MyTextField(
            label = "Senha",
            isPassword = true,
            icon = Icons.Outlined.Lock
        )

        MySwitchState(
            label = "Mantenha-me conectado"
        )

        MyButton(
            label = "Entrar",
            size = 300.dp
        )

        MyButton(
            label = "Registrar",
            size = 300.dp
        )

    }//fecha a colunm aqui fi
}

///////////////////////////////////////////////////////////////////////
@Preview(
    showBackground = true,
    widthDp = 320,
    heightDp = 620
)
@Composable
fun LoginScreenPreview() {
    SocialmediamanhareTheme {
        LoginScreen()
    }
}
