package com.example.gmailclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gmailclone.components.GmailDrawerMenu
import com.example.gmailclone.components.GmailFab
import com.example.gmailclone.components.HomeAppBar
import com.example.gmailclone.components.HomeBottomMenu
import com.example.gmailclone.components.MailList
import com.example.gmailclone.ui.theme.GmailCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GmailApp()
                }
            }
        }
    }
}



@Composable
fun GmailApp() {

  val coroutineScope = rememberCoroutineScope()
   val drawerStates = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scrollState = rememberScrollState()
    ModalNavigationDrawer(
        drawerState = drawerStates,
        drawerContent = {
            ModalDrawerSheet {
                GmailDrawerMenu(scrollState)
            }

        }) {
        Scaffold(

            modifier = Modifier.padding(10.dp), topBar = { HomeAppBar(drawerStates,coroutineScope) },
            bottomBar = {
             HomeBottomMenu()
            },
            floatingActionButton = {
             GmailFab()
            }





            ) {

                 MailList(paddingValues = it)
            }

            }

        }








@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GmailCloneTheme {
        GmailApp()
    }
}