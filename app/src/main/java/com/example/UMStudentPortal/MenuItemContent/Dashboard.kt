package com.example.UMStudentPortal.MenuItemContent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.UMStudentPortal.R
import com.example.UMStudentPortal.ui.theme.MyColor

@Composable
fun DashboardContent() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(5.dp),
        contentAlignment = Alignment.TopCenter
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top

        ) {

            Text(text = "456510", fontSize = 16.sp, color = MyColor.maron)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "Alan Jethro Ecuacion", fontSize = 25.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "Summer 2023", fontSize = 16.sp, color = MyColor.maron)
            Spacer(modifier = Modifier.height(16.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
                    .background(color = MyColor.light_yellow, RoundedCornerShape(5.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = " You're viewing information from an older semester.",
                    fontSize = 12.sp,
                    color = MyColor.maron
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "5th Year", fontSize = 22.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "BS Computer Engineering", fontSize = 22.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(30.dp))
            Box(
                modifier = Modifier
                    .background(color = MyColor.maron, shape = RoundedCornerShape(10.dp))
                    .fillMaxWidth()
                    .height(80.dp)
            ) {

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_announcement),
                        contentDescription = String(),
                        tint = Color.White
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(start = 20.dp),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(text = "All Students", fontSize = 12.sp, color = Color.White)
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Data Privacy Policy",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )

                    }

                }
            }

            //---------------------------------
            Spacer(modifier = Modifier.height(20.dp)) //space

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(color = MyColor.maron, shape = RoundedCornerShape(10.dp)),
            ) {

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_announcement),
                        contentDescription = String(),
                        tint = Color.White
                    )

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(start = 20.dp),
                        verticalArrangement = Arrangement.Center
                    ) {

                        Text(
                            text = "All Students", fontSize = 12.sp,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(
                            text = "Online Classroom Learning Environment Survey",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }

            }


            //-------------------------------
            Spacer(modifier = Modifier.height(45.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(color = MyColor.skyblue, shape = RoundedCornerShape(10.dp))
            ) {

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxHeight(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        painter = painterResource(id = R.drawable.icon_announcement),
                        contentDescription = String(),
                        modifier = Modifier.padding(end = 20.dp)
                    )

                    Text(
                        text = "For any concerns  regarding your assesment, please visit Student Accounting Office or Contac them at (082) 227-5456 local 119",
                        fontSize = 10.sp
                    )
                }


            }
        }
    }
}


@Preview
@Composable
fun DashboardPreview() {

    DashboardContent()
}


