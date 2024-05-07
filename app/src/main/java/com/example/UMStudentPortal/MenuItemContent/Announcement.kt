package com.example.UMStudentPortal.MenuItemContent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AnnouncementContent() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        repeat(10) { // Replace with your desired number of items
                     Text(text = "Announcement Content Item $it", fontSize = 16.sp, modifier = Modifier.padding(16.dp))
        }
    }
}



