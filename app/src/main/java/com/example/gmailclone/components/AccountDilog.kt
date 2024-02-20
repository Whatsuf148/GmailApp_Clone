package com.example.gmailclone.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PersonAddAlt1
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.gmailclone.R

@Composable

fun AccountDialog(openDialog:MutableState<Boolean>){
    Dialog(onDismissRequest = {openDialog.value=false

    },
        properties = DialogProperties(dismissOnClickOutside = false)
    ) {
        AccountDialogUI(openDialog = openDialog)
    }


}

@Composable
fun AccountDialogUI(modifier:Modifier=Modifier, openDialog: MutableState<Boolean>){

    Card(colors = CardDefaults.cardColors(Color.White)){
        Column(modifier = modifier
            .padding(bottom = 16.dp)
            .background(Color.White)) {
            Row(modifier=modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                IconButton(onClick = {
                  openDialog.value=false


                }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription ="")
                }
                Image(painter = painterResource(R.drawable.googlebackground
                ), contentDescription ="",
                    modifier= modifier
                        .weight(2.0f)
                        .size(50.dp)
                        )

                
            }
            Row(modifier= modifier
                .padding(start = 16.dp, top = 16.dp)
                .fillMaxWidth()) {
                Image(painter = painterResource(id =R.drawable.dhindo), contentDescription = "",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                )
                Column(modifier= modifier
                    .padding(start = 16.dp, bottom = 16.dp)
                    .weight(2.0f)) {
                    Text(text = "Dhindo Cricket", fontWeight = FontWeight.SemiBold)
                    Text(text = "dhindocricket@gmail.com")
                    
                }
                Text(text = "99+", modifier=modifier.padding(end=16.dp))
                
            }
            Row(modifier= modifier
                .padding(8.dp)
                .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
                Card(
                    modifier=modifier.requiredWidth(150.dp),
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, Color.White),
                    colors = CardDefaults.cardColors(Color.White),
                    elevation= CardDefaults.cardElevation(5.dp),
                ){
                    Text(text = "Google Account",
                        modifier=modifier.padding(8.dp),
                        textAlign = TextAlign.Center)
                }




            }
            Spacer(modifier = modifier.padding(top=4.dp))
            Divider()
            Row(modifier= modifier
                .padding(start = 16.dp, top = 16.dp)
                .fillMaxWidth()) {
                Icon(imageVector = Icons.Default.PersonAddAlt1, contentDescription = "")
                Text(text = "Add Another Account", fontWeight = FontWeight.SemiBold,
                    modifier=modifier.weight(2.0f)
                        .padding(start=20.dp),
                    )
                
            }


        }
    }

}