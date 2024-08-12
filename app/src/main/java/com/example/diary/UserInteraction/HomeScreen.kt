package com.example.diary.UserInteraction

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diary.Component.AddButton

@Composable
fun HomeScreen(
    navController : NavController
) {
    Box (
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .navigationBarsPadding(),
        contentAlignment = Alignment.BottomEnd
    ){
        AddButton {
            navController.navigate("AddNoteScreen")
        }
    }
}

//@Preview
//@Composable
//private fun test() {
//    HomeScreen()
//}