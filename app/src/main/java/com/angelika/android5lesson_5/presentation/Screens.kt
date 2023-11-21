package com.angelika.android5lesson_5.presentation

sealed class Screens(val route: String){
    object Home: Screens("home")
    object Detail: Screens("detail")
}
