package com.angelika.android5lesson_5.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.angelika.android5lesson_5.models.DogModel

@Composable
fun LazyVerticalGrid(modifier : Modifier){
    val dogs = remember {
        mutableStateListOf<DogModel?>(null)
    }

    val listState = rememberLazyListState()

    LazyVerticalGrid(modifier = modifier.fillMaxWidth().wrapContentHeight(),columns = GridCells.Fixed(2)){
        items(dogs) { country ->
            country?.let {

            }
        }
    }
}