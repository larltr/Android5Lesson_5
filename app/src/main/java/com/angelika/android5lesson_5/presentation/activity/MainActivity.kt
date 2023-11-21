package com.angelika.android5lesson_5.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.angelika.android5lesson_5.presentation.Screens
import com.angelika.android5lesson_5.presentation.screens.catscreen.Screen
import com.angelika.android5lesson_5.presentation.screens.detailscreen.CatDetailScreen
import com.angelika.android5lesson_5.ui.theme.Android5Lesson_5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android5Lesson_5Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = Screens.Home.route) {
                        composable(Screens.Home.route) {
                            Screen(navHostController = navController)
                        }
                        composable(
                            route = "${Screens.Detail.route}/{name}",
                            arguments = listOf(navArgument("name") {
                                type = NavType.StringType
                            })
                        ) { backStackEntry ->
                            CatDetailScreen( backStackEntry = backStackEntry)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    Android5Lesson_5Theme {
        val navController = rememberNavController()
        Screen(navHostController = navController)
    }
}