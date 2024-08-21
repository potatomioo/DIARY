package com.example.diary.UserInteraction

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diary.Component.AddButton
import com.example.diary.Component.NoteItem
import com.example.diary.Notes
import org.w3c.dom.NameList

@Composable
fun HomeScreen(
    navController : NavController
) {

    val NameList = remember {
        mutableListOf<Notes>()
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        items(NameList){item->
            val title = item
        }
    }

    Box (
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .navigationBarsPadding()
    ){
        AddButton(
            modifier = Modifier.align(Alignment.BottomEnd)
        ) {
            navController.navigate("AddNoteScreen")
        }
    }
}

//@Preview
//@Composable
//private fun test() {
//    HomeScreen()
//}