package com.angelika.android5lesson_5.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.angelika.android5lesson_5.R
import com.angelika.android5lesson_5.ui.theme.Android5Lesson_5Theme
import com.angelika.android5lesson_5.ui.theme.Rubik
import com.angelika.android5lesson_5.ui.theme.myPurple

@Composable
fun Screen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(14.dp)
    ) {
        Column(modifier = Modifier.padding(top = 20.dp)) {
            UserInfo(modifier = Modifier)
            Search(modifier = Modifier)
            LazyVerticalGrid(modifier = Modifier, CatViewModel())
        }
    }
}

@Composable
fun UserInfo(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Row {
            Image(
                modifier = modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.user_avatar),
                contentDescription = stringResource(R.string.content_description_user_avatar),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = modifier
                    .padding(top = 2.dp, start = 6.dp)
            ) {
                Text(
                    modifier = modifier.padding(top = 4.dp),
                    text = stringResource(R.string.text_user_name),
                    color = myPurple,
                    fontSize = 16.sp
                )
                Text(
                    modifier = modifier.padding(top = 4.dp),
                    text = "li5.47",
                    color = myPurple,
                    fontFamily = Rubik,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
        Card(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .size(width = 50.dp, height = 50.dp)
                .background(Color.White)
                .clip(shape = CircleShape),
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 10.dp),
                painter = painterResource(id = R.drawable.ic_notifications),
                contentDescription = stringResource(R.string.content_description_notifications),
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Search(modifier: Modifier) {
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        modifier = modifier
            .padding(top = 20.dp)
            .height(50.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp)),
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        colors = TextFieldDefaults.textFieldColors(
            textColor = Color.White,
            unfocusedIndicatorColor = Color.Gray,
            containerColor = Color.Gray
        ),
        trailingIcon = {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(50.dp)
                    .background(
                        myPurple,
                        shape = RoundedCornerShape(topStart = 10.dp, bottomStart = 10.dp)
                    )
            ) {
                Icon(
                    modifier = Modifier
                        .align(Alignment.Center),
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = stringResource(
                        R.string.content_description_icon_search
                    ),
                    tint = Color.White
                )
            }
        },
        label = {
            Text(
                text = "Search",
                color = Color.DarkGray
            )
        }
    )
}

@Composable
fun TextCat(modifier: Modifier) {
    Row(modifier = modifier) {
        Text(
            text = "The Best Cat",
            color = Color.Gray,
            fontSize = 18.sp,
            fontFamily = Rubik,
            fontWeight = FontWeight.Bold
        )
        Icon(
            modifier = Modifier
                .padding(top = 4.dp, start = 4.dp),
            painter = painterResource(id = R.drawable.ic_cat), contentDescription = stringResource(
                R.string.content_description_icon_cat
            ),
            tint = Color.Gray
        )
    }
}

@Preview
@Composable
fun UserInfoPreview() {
    Android5Lesson_5Theme {
        Screen()
    }
}