package com.example.diary.UserInteraction

import android.provider.ContactsContract.CommonDataKinds.Note
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diary.CRUD.getList
import com.example.diary.Component.AddButton
import com.example.diary.Component.NoteItem
import com.example.diary.Notes
import org.w3c.dom.NameList

@Composable
fun HomeScreen(
    navController : NavController
) {

    val NameList = remember {
        mutableStateListOf<Notes>()
    }
    LaunchedEffect(Unit){
        getList(NameList)
    }

    Box (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .navigationBarsPadding()
            .statusBarsPadding(),
        contentAlignment = Alignment.BottomEnd
    ){
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(NameList){item->
                val title = item.Title
                val note = item.note
                val id = item.id

                NoteItem(note = Notes(id,title,note))
            }
        }

        AddButton(
            Modifier
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