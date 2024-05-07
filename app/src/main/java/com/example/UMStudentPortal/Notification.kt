package com.example.UMStudentPortal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NotificationIcon(count: Int, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(CircleShape)
            .background(Color.Red)
            .size(24.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "Notification",
            tint = Color.White,
            modifier = Modifier.size(16.dp)
        )
        if (count > 0) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                    .size(16.dp)
                    .align(Alignment.TopEnd)
            ) {
                Text(
                    text = count.toString(),
                    color = Color.Red,
                    fontSize = 10.sp
                )
            }
        }
    }
}

