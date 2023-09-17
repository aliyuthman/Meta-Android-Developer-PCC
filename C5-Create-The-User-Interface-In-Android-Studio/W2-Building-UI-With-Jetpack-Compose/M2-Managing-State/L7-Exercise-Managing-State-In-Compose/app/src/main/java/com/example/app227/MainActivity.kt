package com.example.app227

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app227.ui.theme.App227Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App227Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val context = LocalContext.current

    var username by remember {

        mutableStateOf(TextFieldValue(""))

    }

    var password by remember {

        mutableStateOf(TextFieldValue(""))

    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.littlelemonlogo
            ),
            contentDescription = "Logo Image",
            modifier = Modifier.padding(10.dp),
        )
        TextField(
            modifier = Modifier.padding(10.dp),
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Username") },
        )
        TextField(
            modifier = Modifier.padding(10.dp),
            value = password,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation(),
            label = { Text(text = "Password") },
        )
        Button(

            onClick = {
                Log.d("AAA", "${username.text}")
                Log.d("AAA", "${password.text}")
                if (username.text == "darian" && password.text == "littlelemon") {

                    Toast.makeText(context, "Welcome to Little Lemon", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(context, "Invalid credentials. Please try again", Toast.LENGTH_LONG).show()

                }
            },
            modifier = Modifier.padding(10.dp),
            colors = ButtonDefaults.buttonColors(
                Color(0xFF495E57)
            )
        ) {

            Text(
                modifier = Modifier.padding(10.dp),
                text = "Login",
                color = Color(0xFFEDEFEE)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}