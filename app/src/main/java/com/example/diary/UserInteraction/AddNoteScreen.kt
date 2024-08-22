package com.example.diary.UserInteraction

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.diary.CRUD.addNote
import com.example.diary.Notes
import com.example.diary.ui.theme.Pink80

@Composable
fun AddNoteScreen(
    navController: NavController
) {

    var title by remember {
        mutableStateOf("")
    }
    var content by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .navigationBarsPadding()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomEnd),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(value = title, onValueChange = { title = it }, label = { Text(text = "Title")})
            Spacer(modifier = Modifier.height(5.dp))
            TextField(value = content, onValueChange = { content = it },label = { Text(text = "Note")})
            Spacer(modifier = Modifier.height(5.dp))
        }
            IconButton(
                onClick = {
                    addNote(
                        note = Notes(
                            "",title, content
                        )
                    )
                    navController.navigate("HomeScreen")
                },
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(5.dp))
                    .background(color = Pink80)
                    .border(1.5.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
                    .size(65.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp),
                    tint = Color.Black
                )
            }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//private fun Test() {
//    AddNoteScreen()
//}