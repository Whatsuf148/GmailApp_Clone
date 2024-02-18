package com.example.gmailclone.module

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

 sealed class BottomMenuData(
    val icon: ImageVector,
    val bottomTitle:String
) {
    object Mail:BottomMenuData(icon= Icons.Outlined.Mail, bottomTitle = "Mail")
     object Meet: BottomMenuData(icon = Icons.Outlined.VideoCall, bottomTitle = "Meet")

}