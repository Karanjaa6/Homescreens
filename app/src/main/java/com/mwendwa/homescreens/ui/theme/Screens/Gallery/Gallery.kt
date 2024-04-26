package com.mwendwa.homescreens.ui.theme.Screens.Gallery

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mwendwa.homescreens.R

@Composable
fun GalleryScreen(navController: NavController){
Box(modifier = Modifier.fillMaxSize()) {
Image(
    painter = painterResource(id = R.drawable.pic),
    contentDescription = "background", contentScale = ContentScale.FillBounds,
    modifier = Modifier.matchParentSize())
    Box {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Go to home screen")
    }
}

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GalleryScreenPreview(){
    GalleryScreen(rememberNavController())
}