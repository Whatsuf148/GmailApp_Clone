package com.example.gmailclone.module

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.CalendarMonth
import androidx.compose.material.icons.outlined.Contacts
import androidx.compose.material.icons.outlined.Drafts
import androidx.compose.material.icons.outlined.Help
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.outlined.Snooze
import androidx.compose.material.icons.outlined.Tag
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData(val icon: ImageVector ?= null,
                            val title: String ?= null,
                            val isDivider:Boolean =false,
                            val isHeader:Boolean=false){
    object AllInbox : DrawerMenuData(
        icon = Icons.Outlined.MailOutline,
        title = "All Inbox",

    )
    object Primary : DrawerMenuData(
        icon = Icons.Default.Email,
        title = "Primary"
    )
    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        title = "Person"

    )
    object Outbox: DrawerMenuData(
        icon= Icons.Outlined.MailOutline,
        title = "Outbox"
    )
    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        title = "Sent"
    )
    object Snooze: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        title = "Snooze"

    )
    object Draft: DrawerMenuData(
        icon= Icons.Outlined.Drafts,
        title = "Draft"

    )
    object Calender: DrawerMenuData(icon = Icons.Outlined.CalendarMonth,title = "Calender")
    object Contact: DrawerMenuData(icon = Icons.Outlined.Contacts, title = "Contacts")
    object Setting: DrawerMenuData(icon = Icons.Outlined.Settings, title = "Settings")
    object Help: DrawerMenuData(icon = Icons.Outlined.Help, title = "Help")
    object Promotion: DrawerMenuData(icon = Icons.Outlined.Tag , title = "Promotion")
    object Divider: DrawerMenuData(isDivider = true)
    object Header: DrawerMenuData(isHeader = true , title = "ALL LABELS")
    object HeaderTwo: DrawerMenuData(isHeader = true, title = "GOOGLE APPS")
}
