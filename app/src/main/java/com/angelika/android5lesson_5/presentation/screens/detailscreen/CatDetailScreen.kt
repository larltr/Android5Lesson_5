package com.angelika.android5lesson_5.presentation.screens.detailscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.angelika.android5lesson_5.R

@Composable
fun CatDetailScreen(
    modifier: Modifier = Modifier,
    backStackEntry: NavBackStackEntry
) {
    val image = backStackEntry.arguments?.getString("name")
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        image?.let {
            AsyncImage(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(15.dp))
                    .size(height = 180.dp, width = 170.dp),
                model = ImageRequest.Builder(LocalContext.current).data(image.replace("-", "/"))
                    .crossfade(true)
                    .build(),
                contentDescription = stringResource(R.string.content_description_image_cat),
                placeholder = painterResource(id = R.drawable.image_not_found),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "ABOBA23462 ONE LOVE",
            style = TextStyle(fontSize = 18.sp),
            color = Color.Black
        )
    }
}