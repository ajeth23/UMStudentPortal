package com.example.UMStudentPortal

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProfileSection(isProfileExpanded: Boolean, onProfileClick: () -> Unit) {
    var showNotificationPopup by remember { mutableStateOf(false) }
    var randomNotificationMessage by remember { mutableStateOf("") }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(66.dp)
            .padding(10.dp)
            .background(color = Color.White, shape = RoundedCornerShape(5.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(66.dp)
                .background(color = Color.White, shape = RoundedCornerShape(5.dp)),

            ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Profile icon
                Icon(
                    painter = painterResource(id = R.drawable.user),
                    contentDescription = "Profile",
                    tint = Color.Black,
                    modifier = Modifier
                        .height(50.dp)
                        .width(40.dp)
                        .size(30.dp)
                        .padding(end = 5.dp, start = 10.dp)
                        .clip(CircleShape)
                        .clickable { onProfileClick },
                )

                // Profile information
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 15.dp),
                    verticalArrangement = Arrangement.Center,

                    ) {
                    Text(text = "Alan Jethro Ecuacion", fontSize = 15.sp)
                    Text(text = "ID: 456510", fontSize = 12.sp, color = Color.Black)

                }

            }

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                contentAlignment = Alignment.TopEnd
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "notification",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { },

                    )

            }

        }
    }


}


@Preview
@Composable
fun ProfilePreview() {
    ProfileSection(isProfileExpanded = true) {

    }

}