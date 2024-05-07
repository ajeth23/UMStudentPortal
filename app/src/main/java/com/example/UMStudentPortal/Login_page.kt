package com.example.UMStudentPortal

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        setContent {
            LogInPage()
        }
    }
}

@Composable
fun LogInPage() {
    var isLoggedIn by remember { mutableStateOf(false) }
    var showLoginError by remember { mutableStateOf(false) }
    var isLoggingIn by remember { mutableStateOf(false) }

    if (isLoggedIn) {
        MainPage()
    } else {
        LoginPage(
            onLogin = { email, password ->
                // Simulate login process (replace with actual login validation)
                isLoggingIn = true
                // Fake login delay

                //  delay(2000) // Simulate login delay
                if ((email == "" && password == "") || email == "umindanao@gmail.com") {
                    isLoggedIn = true
                } else {
                    showLoginError = true
                }
                isLoggingIn = false
            },
            showLoginError = showLoginError,
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(onLogin: (String, String) -> Unit, showLoginError: Boolean) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.um_logo),
            contentDescription = "umlogo",
            modifier = Modifier
                .height(200.dp)
                .width(200.dp),
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "University of Mindanao",
            style = TextStyle(fontSize = 30.sp),
        )

        Spacer(modifier = Modifier.height(34.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth(0.8f),
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            visualTransformation = PasswordVisualTransformation(), // Show password dots
            modifier = Modifier.fillMaxWidth(0.8f),
        )
        Spacer(modifier = Modifier.height(16.dp))

        AnimatedVisibility(
            visible = showLoginError,
            enter = fadeIn() + slideInVertically(),
            exit = fadeOut() + slideOutVertically(),
        ) {
            Text(
                text = "Invalid email or password",
                color = Color.Red,
                modifier = Modifier.padding(bottom = 16.dp),
            )
        }

        Button(
            onClick = { onLogin(email, password) },
            modifier = Modifier.fillMaxWidth(0.5f),
        ) {
            val isLoggingIn = false
            if (isLoggingIn) {
                CircularProgressIndicator(
                    color = Color.Red,
                    modifier = Modifier.size(20.dp),
                    strokeWidth = 2.dp,
                )
            } else {
                Text("Login")
            }
        }
    }
}

@Preview
@Composable
fun PreviewLogin() {
    LogInPage()
}
