package br.qi.socialmediamanha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.qi.socialmediamanha.ui.theme.SocialMediaManhaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SocialMediaManhaTheme {
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun PostProfile(
    @DrawableRes image : Int,
    name : String,
    time : String
){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Foto do perfil",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = CircleShape
                )
                .size(50.dp)
        )
        Spacer(
            modifier = Modifier.padding(horizontal = 6.dp)
        )

        Column(

        ) {
            Text(
                text = name,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = time,
                color = Color.Gray
            )
        }
    }
}

@Composable
fun Post(
    @DrawableRes image : Int,
    modifier: Modifier = Modifier
){
    Box {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Imagem ou video do post",
            modifier = modifier.fillMaxSize()
        )
    }
}

@Composable
fun PostIcons(
    like : Boolean,
    modifier: Modifier = Modifier
) {
    Row{
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Filled.FavoriteBorder,
                contentDescription = "Ícone de curtidas",
                modifier.size(30.dp)
            )
        }
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Filled.Edit,
                contentDescription = "Ícone de comentário",
                modifier.size(30.dp)
            )
        }
    }
}




//nada n e so pa separar fi

@Preview(showBackground = true)
@Composable
fun PostProfilePreview() {
    SocialMediaManhaTheme {
        PostProfile(
            image = R.drawable.ic_launcher_foreground,
            name = "Android Arnold Schwarzenegger",
            time = "24 minutos atrás"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostPreview(){
    SocialMediaManhaTheme {
        Post(image = R.drawable.ic_launcher_background)
    }
}

@Preview(showBackground = true)
@Composable
fun PostIconsPreview() {
    SocialMediaManhaTheme {
        PostIcons(like = true)
    }
}
