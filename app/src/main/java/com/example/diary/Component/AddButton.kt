package com.example.diary.Component

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diary.ui.theme.Pink80

@Composable
fun AddButton(
    modifier : Modifier,
    onclick : () ->Unit
) {
    IconButton(
        modifier = Modifier
            .clip(CircleShape)
            .background(color = com.example.diary.ui.theme.AddButton)
            .border(0.5.dp, color = Color.Black, shape = CircleShape)
            .size(65.dp),
        onClick = onclick
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            tint = Color.Black
        )
    }

}


@Preview(showBackground = true)
@Composable
fun check() {
    AddButton(Modifier,{})
}