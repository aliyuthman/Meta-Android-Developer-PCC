package com.example.app233

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerPanel(drawerState: DrawerState, scope: CoroutineScope) {

    ModalDrawerSheet {
        Text(text = "Drawer title", Modifier.padding(16.dp))
        Divider()

        List(10) {
            NavigationDrawerItem(
                label = { Text(text = "Drawer Items #$it") },
                selected = false,
                modifier = Modifier.padding(horizontal = 20.dp, vertical = 10.dp),
                onClick = {  })
        }

        IconButton(onClick = { scope?.launch { drawerState?.close() } }) {

            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Close Icon")

        }


    }



}