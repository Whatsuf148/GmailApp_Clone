package com.example.gmailclone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerState
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.gmailclone.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun HomeAppBar(scaffoldState: DrawerState ,scope: CoroutineScope,openDialog: MutableState<Boolean>){


    Box(modifier = Modifier.padding(6.dp)){
        Card(shape = RoundedCornerShape(10.dp) , elevation =CardDefaults.cardElevation(7.dp),
            colors = CardDefaults.cardColors(Color.White),
            modifier = Modifier.requiredHeight(55.dp)) {
            Row(verticalAlignment = Alignment.CenterVertically ,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            ){
                IconButton(onClick = {
                    scope.launch { scaffoldState.open()
                    }
                })

                {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription ="Menu")
                }


                Text(text = "Search in Mail" , modifier = Modifier.weight(2.0f), textAlign = TextAlign.Center)
                Image(painter = painterResource(id =R.drawable.dhindo), contentDescription = "",
                    modifier = Modifier
                        .size(20.dp)
                        .clip(CircleShape)
                        .background(Color.Gray)
                        .clickable {
                            openDialog.value = true


                        }


                )
                if(openDialog.value){
                    AccountDialog(openDialog = openDialog)
                }




            }



        }

    }

}