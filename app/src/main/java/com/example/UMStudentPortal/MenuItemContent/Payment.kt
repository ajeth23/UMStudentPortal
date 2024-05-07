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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.isDigitsOnly
import com.example.UMStudentPortal.R
import com.example.UMStudentPortal.ui.theme.MyColor


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PaymentContent() {

    //Outlined Textfield
    var studentID by remember { mutableStateOf("") }
    var amount by remember { mutableStateOf("") }

    //Dropdown Menu
    var isEpanded by remember { mutableStateOf(false) }
    var purpose by remember { mutableStateOf("Purpose of Payment") }


    Column(
        modifier = Modifier
            .background(color = Color.White)
            .padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 15.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top


    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Online Payment", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Main Campus",
            fontSize = 18.sp,
            color = MyColor.maron,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Payment Details", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(15.dp))

        Box(
            modifier = Modifier
                .height(40.dp)
                .width(300.dp)
                .background(
                    color = MyColor.light_yellow,
                    shape = RoundedCornerShape(5.dp)
                ),
        ) {

            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.icon_announcement),
                    contentDescription = "sample",
                    modifier = Modifier
                        .padding(start = 10.dp, end = 20.dp)
                        .size(20.dp)
                )

                Text(
                    text = "Always double check the URL on the address bar.",
                    fontSize = 10.sp
                )
            }

        }

        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier
                .height(40.dp)
                .width(300.dp)
                .background(
                    color = MyColor.light_yellow,
                    shape = RoundedCornerShape(5.dp)
                ),


            ) {

            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.icon_announcement),
                    contentDescription = "sample",
                    modifier = Modifier
                        .padding(start = 10.dp, end = 20.dp)
                        .size(20.dp)
                )

                Text(
                    text = "Your URL should start with: https://student.umindanao.edu.ph",
                    fontSize = 10.sp
                )
            }

        }


        Spacer(modifier = Modifier.height(18.dp))
        Box(
            modifier = Modifier
                .height(500.dp)
                .fillMaxWidth()
        )
        {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White),
                elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)

            ) {

                Column(
                    modifier = Modifier
                        .background(color = Color.White)
                        .padding(15.dp)
                        .fillMaxHeight()
                       // .verticalScroll(rememberScrollState())
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top

                ) {


                    Box(
                        modifier = Modifier
                            .height(50.dp)
                            .width(300.dp)
                            .background(
                                color = MyColor.light_blue,
                                shape = RoundedCornerShape(5.dp)
                            ),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_announcement),
                                contentDescription = "sample",
                                modifier = Modifier
                                    .padding(start = 10.dp, end = 20.dp)
                                    .size(20.dp)
                            )
                            Text(
                                text = "Currently, we accept payments for tuition fee and downpayment only.",
                                fontSize = 10.sp
                            )
                        }
                    }


                    Spacer(modifier = Modifier.height(20.dp))
                    Box(
                        modifier = Modifier
                            .height(85.dp)
                            .width(300.dp)
                            .background(
                                color = MyColor.light_blue,
                                shape = RoundedCornerShape(5.dp)
                            ),
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxHeight()
                                .padding(10.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.icon_announcement),
                                contentDescription = "sample",
                                modifier = Modifier
                                    .padding(start = 10.dp, end = 20.dp)
                                    .size(20.dp)
                            )
                            Text(
                                text = stringResource(R.string.advance_downpayment),
                                fontSize = 10.sp
                            )
                        }
                    }


                    //Dropdown Menu
                    Spacer(modifier = Modifier.height(20.dp))
                    ExposedDropdownMenuBox(
                        expanded = isEpanded,
                        onExpandedChange = { isEpanded = it }) {

                        OutlinedTextField(
                            value = purpose,
                            onValueChange = {},
                            readOnly = true,
                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(expanded = isEpanded)
                            },

                            colors = ExposedDropdownMenuDefaults.textFieldColors(),
                            modifier = Modifier.menuAnchor().fillMaxWidth(0.8f)
                        )

                        ExposedDropdownMenu(
                            expanded = isEpanded,
                            onDismissRequest = { isEpanded = false }) {
                            DropdownMenuItem(text = {
                                Text(text = "Downpayment")
                            },
                                onClick = {
                                    purpose = "Downpayment"
                                    isEpanded = false
                                })

                            DropdownMenuItem(text = {
                                Text(text = "Tuition fee")
                            }, onClick = {
                                purpose = "Tuition fee"
                                isEpanded = false
                            })
                        }
                    }

                    //OUtlinedTextField for StudentID
                    Spacer(modifier = Modifier.height(14.dp))
                    OutlinedTextField(
                        value = studentID,
                        onValueChange = { newStudentID ->
                            if (newStudentID.isEmpty() || newStudentID.isDigitsOnly()) {
                                studentID = newStudentID
                            }
                        },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        label = { Text("Student ID") },
                        modifier = Modifier.fillMaxWidth(0.8f)
                    )

                    //OUtlinedTextField for Amount
                    Spacer(modifier = Modifier.height(14.dp))
                    OutlinedTextField(
                        value = amount,
                        onValueChange = { newAmount ->
                            if (newAmount.isEmpty() || newAmount.isDigitsOnly()) {
                                amount = newAmount
                            }
                        },
                        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                        label = { Text("Amount") },
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                    )
                }
            }
        }


        Spacer(modifier = Modifier.height(15.dp))
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopEnd,
        ) {
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth(0.5f),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor = MyColor.maron

                )
            ) {
                val isLoggingIn = false
                if (isLoggingIn) {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .size(20.dp)
                            .background(color = MyColor.maron),
                        strokeWidth = 1.dp
                    )
                } else {
                    Text("Proceed")
                }
            }


        }

    }

}


@Preview
@Composable
fun PaymentPreview() {


    PaymentContent()


}