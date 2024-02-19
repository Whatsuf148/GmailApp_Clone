package com.example.gmailclone.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun GmailFab(){
    FloatingActionButton(onClick = {},
        containerColor = MaterialTheme.colorScheme.surface) {
        Icon(imageVector = Icons.Default.Edit, contentDescription ="" )

    }
}