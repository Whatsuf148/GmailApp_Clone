package com.example.gmailclone.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.gmailclone.module.BottomMenuData

@Composable

fun HomeBottomMenu(){
  val buttonMenuList = listOf(
      BottomMenuData.Mail,
      BottomMenuData.Meet

  )
  NavigationBar(containerColor = Color.White , contentColor = Color.Black) {
      buttonMenuList.forEach {
          NavigationBarItem(selected = false, onClick = { /*TODO*/ },
              label = {Text(text = it.bottomTitle)},
              alwaysShowLabel = true,
              icon = { Icon(
              imageVector = it.icon,
              contentDescription = it.bottomTitle
          ) })
      }
      
  }
}





