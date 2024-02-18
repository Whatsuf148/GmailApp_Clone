package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gmailclone.module.DrawerMenuData

@Composable
fun GmailDrawerMenu(scrollState:ScrollState){
    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInbox,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotion,
        DrawerMenuData.Header,
        DrawerMenuData.Snooze,
        DrawerMenuData.Sent,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.HeaderTwo,
        DrawerMenuData.Calender,
        DrawerMenuData.Contact,
        DrawerMenuData.Divider,
        DrawerMenuData.Help,
        DrawerMenuData.Setting
    )
    Column(modifier =Modifier.verticalScroll(scrollState)) {
        Text(text = "Gmail", color = Color.Red, modifier = Modifier.padding(start = 20.dp,
            top=20.dp), fontSize = 20.sp , fontWeight = FontWeight.Bold
        )
        menuList.forEach{
            item->
            if(item.isDivider){

                    Divider(modifier = Modifier.padding(top=10.dp , bottom = 10.dp))
                }
            else if (item.isHeader)
                 {
                    Text(text = item.title!!, fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top=20.dp , bottom = 20.dp , start=20.dp))
                }
            else{
                DrawerMenuItem(item = item)

            }




        }
    }
}

@Composable
fun DrawerMenuItem(item: DrawerMenuData){
    Row( modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .padding(top = 16.dp)){
       Image(imageVector = item.icon!!, contentDescription = item.title , modifier = Modifier.weight(0.5f))
        Text(text =item.title!! , modifier= Modifier.weight(2.0f))
    }


}