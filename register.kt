package br.qi.socialmediamanhare.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.qi.socialmediamanhare.DatePickerExamples
import br.qi.socialmediamanhare.MyButton
import br.qi.socialmediamanhare.MyTextField
import br.qi.socialmediamanhare.MyTopBar
import br.qi.socialmediamanhare.ui.theme.SocialmediamanhareTheme




@Composable
fun RegisterScreen() {
    Column  (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.LightGray),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
       Text("CADASTRO")

        Spacer(modifier = Modifier.height(50.dp))

        MyTextField(
            label = "Usuário",
            isPassword = false,
            icon = Icons.Outlined.Person
        )
        Spacer(modifier = Modifier.height(20.dp))

        MyTextField(
            label = "Email",
            isPassword = false,
            icon = Icons.Outlined.Email
        )
        Spacer(modifier = Modifier.height(20.dp))

        MyTextField(
            label = "Telefone",
            isPassword = false,
            icon = Icons.Outlined.Call
        )
        Spacer(modifier = Modifier.height(20.dp))

        DatePickerExamples()

        Spacer(modifier = Modifier.height(20.dp))

        MyTextField(
            label = "Senha",
            isPassword = true,
            icon = Icons.Outlined.Lock
        )
        Spacer(modifier = Modifier.height(200.dp))

        MyButton(
            label = "CADASTRAR",
            size = 300.dp
        )


       }//fecha a coluna aqui fi

}

/////////////////////////////////////////////////////////////////////////////////////////

@Preview(showBackground = true)
@Composable
fun RegisterScreenPreview() {
    SocialmediamanhareTheme {
        RegisterScreen()
    }
}
