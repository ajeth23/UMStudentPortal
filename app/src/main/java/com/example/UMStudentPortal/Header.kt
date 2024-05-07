package com.example.UMStudentPortal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun DrawerHeader() {

    Box(modifier = Modifier) {

        Row {

            Image(
                painter = painterResource(id = R.drawable.um_logo),
                contentDescription = "logo",
                modifier = Modifier.size(50.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Divider(modifier = Modifier
                .background(color = Color.Gray)
                .height(50.dp)
                .width(1.dp))

            Column(modifier = Modifier.padding(start = 15.dp)) {
                Text(text = "UM", fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = "Student Portal", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }



        }

    }


}


@Preview
@Composable

fun HeaderPreview(){
DrawerHeader()

}