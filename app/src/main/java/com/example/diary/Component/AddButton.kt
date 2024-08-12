package com.example.diary.Component

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diary.ui.theme.Pink80

@Composable
fun AddButton(
    onclick : () ->Unit
) {
    IconButton(
        onClick = onclick,
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .background(color = Pink80)
            .border(1.5.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
            .size(75.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp),
            tint = Color.Black
        )
    }
}


@Preview(showBackground = true)
@Composable
fun check() {
    AddButton({})
}