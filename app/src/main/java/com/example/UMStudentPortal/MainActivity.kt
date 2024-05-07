package com.example.UMStudentPortal

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.UMStudentPortal.MenuItemContent.AnnouncementContent
import com.example.UMStudentPortal.MenuItemContent.ClassScheduleContent
import com.example.UMStudentPortal.MenuItemContent.DashboardContent
import com.example.UMStudentPortal.MenuItemContent.EnrollCourseContent
import com.example.UMStudentPortal.MenuItemContent.PaymentContent
import com.example.UMStudentPortal.MenuItemContent.VMG
import com.example.UMStudentPortal.ui.theme.MyColor
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainPage() {
    val items = remember {
        listOf(
            "Vision Mission and Values",
            "Dashboard",
            "Online Payment",
            "Announcement",
            "Enroll Course",
            "Class Schedule",
            "Online Databases",
            "SPR",
            "Evaluation",
            "Promissory Note",
            "Scholarship",
            "Excess Option",
            "Tuition Payments",
            "Payment History",
            "All",
            "Submit a feedback",
            "Academic Services",
        )
    }

    var selectedItem by remember { mutableStateOf("Dashboard") }
    var isProfileExpanded by remember { mutableStateOf(false) }
    val notificationCount by remember { mutableIntStateOf(3) }

    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        ProfileSection(isProfileExpanded = isProfileExpanded) {
            isProfileExpanded = !isProfileExpanded
        }

        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = selectedItem, fontSize = 14.sp) },
                    navigationIcon = {
                        IconButton(onClick = { scope.launch { scaffoldState.drawerState.open() } }) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Menu",
                            )
                        }
                    },
                    actions = {
                        // "Notification" icon in the app bar
                        NotificationIcon(notificationCount)
                    },

                    // modifying TopBar
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
                        .clip(shape = RoundedCornerShape(6.dp)),
                    backgroundColor = MyColor.maron,
                    contentColor = Color.White,
                    elevation = 18.dp,

                )
            },

            // modifying Drawer
            // drawerShape = RoundedCornerShape(bottomEnd = 10.dp, topEnd = 10.dp),
            drawerElevation = 0.dp,
            drawerBackgroundColor = Color.Transparent,
            drawerContentColor = Color.Transparent,

            drawerContent = {
                DrawerContent(items) { newItem ->
                    selectedItem = newItem
                    scope.launch { scaffoldState.drawerState.close() }
                }
            },
            scaffoldState = scaffoldState,
        ) {
            // Content display based on selectedItem here...
            when (selectedItem) {
                "Vision Mission and Values" -> VMG()
                "Dashboard" -> DashboardContent()
                "Online Payment" -> PaymentContent()
                "Announcement" -> AnnouncementContent()
                "Enroll Course" -> EnrollCourseContent()
                "Class Schedule" -> ClassScheduleContent()
                "Online Databases" -> ClassScheduleContent()
                "SPR" -> ClassScheduleContent()
                "Evaluation" -> ClassScheduleContent()
                "Promissory Note" -> ClassScheduleContent()
                "Scholarship" -> ClassScheduleContent()
                "Excess Option" -> ClassScheduleContent()
                "Tuition Payments" -> ClassScheduleContent()
                "Payment History" -> ClassScheduleContent()
                "All" -> ClassScheduleContent()
                "Submit a feedback" -> ClassScheduleContent()
                "Academic Services" -> ClassScheduleContent()
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    MainPage()
}
