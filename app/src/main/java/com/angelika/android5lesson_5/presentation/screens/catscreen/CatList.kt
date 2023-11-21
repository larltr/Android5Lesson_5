package com.angelika.android5lesson_5.presentation.screens.catscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.angelika.android5lesson_5.R
import com.angelika.android5lesson_5.data.model.CatModel
import com.angelika.android5lesson_5.ui.theme.Rubik
import com.angelika.android5lesson_5.ui.theme.myPurple

@Composable
fun LazyVerticalGrid(modifier: Modifier, catViewModel: CatViewModel) {

//    val cats = remember {
//        mutableStateListOf<CatModel?>(null)
//    }

    val listState = catViewModel.catState.collectAsState()

    LazyVerticalGrid(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        columns = GridCells.Adaptive(140.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(listState.value) { cat ->
            cat.let {
                CatItem(cat = cat)
            }
        }
    }
}

@Composable
fun CatItem(modifier: Modifier = Modifier, cat: CatModel) {
    Box(
        modifier = modifier
            .clip(shape = RoundedCornerShape(topStart = 15.dp, topEnd = 15.dp))
    ) {
        AsyncImage(
            modifier = Modifier.clip(shape = RoundedCornerShape(15.dp))
                .size(height = 180.dp, width = 170.dp),
            model = ImageRequest.Builder(LocalContext.current).data(cat.image).crossfade(true)
                .build(),
            contentDescription = stringResource(R.string.content_description_image_cat),
            placeholder = painterResource(id = R.drawable.image_not_found),
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .align(Alignment.BottomCenter),
            text = cat.name,
            fontSize = 14.sp,
            color = myPurple,
            fontFamily = Rubik,
            fontWeight = FontWeight.Bold
        )
    }
}