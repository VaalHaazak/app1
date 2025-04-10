package br.qi.motiveme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import br.qi.motiveme.ui.theme.MotiveMETheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotiveMETheme {


            }
        }
    }
}

@Composable
fun Greeting(apelido: String, modifier: Modifier = Modifier, myColor: Color) {
    Box(
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Hello $apelido!",
            color = myColor,
            modifier = modifier
        )
    }
}

@Preview(
    widthDp = 300,
    heightDp = 450,
    showBackground = true
)
@Composable
fun GreetingPreview() {
    MotiveMETheme {
        Greeting("Anrnold Schwarzenegger!", myColor = Color.Red)
    }
}
