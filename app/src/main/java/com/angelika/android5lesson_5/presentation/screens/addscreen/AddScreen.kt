package com.angelika.android5lesson_5.presentation.screens.addscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AddScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Column(verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically)) {
            var textChange by remember {
                mutableStateOf("")
            }
            TextField(
                modifier = modifier
                    .padding(top = 20.dp)
                    .height(50.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp)),
                value = textChange,
                onValueChange = { newText ->
                    textChange = newText
                },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    unfocusedIndicatorColor = Color.Gray,
                    containerColor = Color.Gray
                ),
                label = {
                    Text(
                        text = "Input cat's breed",
                        color = Color.DarkGray
                    )
                }
            )

            Button(modifier = Modifier.fillMaxWidth(), onClick = {}) {
                Text(text = "Add")
            }
        }
    }
}