package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.images)
            InitCard(painter = painter, contextDisc = "", title = "")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val painter = painterResource(id = R.drawable.images)
    InitCard(painter = painter, contextDisc = "To Do", title = "The Same Title")

}

@Composable
fun InitCard(painter: Painter, contextDisc: String, title: String) {
    Card(modifier = Modifier
        .fillMaxSize()
        .padding(15.dp), backgroundColor = Color.White, elevation = 10.dp, shape = RoundedCornerShape(25.dp)) {
    Box(modifier = Modifier.fillMaxSize(0.5f)){
        Image(painter = painter, contentDescription = contextDisc)
    }
    }
}