package com.example.jetnote.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TopAppBar(
    title       : String,
    icon        : ImageVector,
    onIconClick : () -> Unit,
){

}

@Preview
@Composable
private fun TopAppBarPriview(){
    TopAppBar(
        title = "JetNotes",
        icon = Icons.Filled.List,
        onIconClick = {}
    ) {

    }
}

fun TopAppBar(title: String, icon: ImageVector, onIconClick: () -> Unit, function: () -> Unit) {

}
