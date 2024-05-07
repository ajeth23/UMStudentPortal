//package com.example.weatherapp
//
//import android.annotation.SuppressLint
//import androidx.compose.animation.core.animateDpAsState
//import androidx.compose.animation.core.animateFloatAsState
//import androidx.compose.animation.core.tween
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxHeight
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.offset
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.foundation.verticalScroll
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Menu
//import androidx.compose.material.rememberScaffoldState
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.alpha
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.res.vectorResource
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.example.weatherapp.MenuItemContent.AnnouncementContent
//import com.example.weatherapp.MenuItemContent.ClassScheduleContent
//import com.example.weatherapp.MenuItemContent.DashboardContent
//import com.example.weatherapp.MenuItemContent.EnrollCourseContent
//import com.example.weatherapp.MenuItemContent.PaymentContent
//import com.example.weatherapp.MenuItemContent.VMG
//import com.example.weatherapp.ui.theme.MyColor
//
//
//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "CoroutineCreationDuringComposition")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MainPage1() {
//    val items = remember {
//        listOf(
//            "Vision Mission and Values",
//            "Dashboard",
//            "Online Payment",
//            "Announcement",
//            "Enroll Course",
//            "Class Schedule",
//            "Online Databases",
//            "SPR",
//            "Evaluation",
//            "Promissory Note",
//            "Scholarship",
//            "Excess Option",
//            "Tuition Payments",
//            "Payment History",
//            "All",
//            "Submit a feedback",
//            "Academic Services"
//        )
//    }
//
//    val iconVisionMission = ImageVector.vectorResource(R.drawable.icon_school)
//    val iconDashboard = ImageVector.vectorResource(R.drawable.icondashboard)
//    val iconOnlinePayment = ImageVector.vectorResource(R.drawable.iconpayment)
//    val iconAnnouncement = ImageVector.vectorResource(R.drawable.icon_announcement)
//    val iconEnrollCourse = ImageVector.vectorResource(R.drawable.iconenroll)
//    val iconClassSchedule = ImageVector.vectorResource(R.drawable.iconclass)
//
//    var selectedItem by remember { mutableStateOf("Dashboard") }
//    var isMenuExpanded by remember { mutableStateOf(false) }
//    var isProfileExpanded by remember { mutableStateOf(false) }
//    var notificationCount by remember { mutableStateOf(3) }
//
//    val scaffoldState = rememberScaffoldState()
//    val scope = rememberCoroutineScope()
//
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.White)
//    ) {
//        Spacer(modifier = Modifier.height(10.dp)) // Add a spacer to push content down
//
//        ProfileSection(isProfileExpanded = isProfileExpanded) {
//            isProfileExpanded = !isProfileExpanded
//        }
//
//
//        ////////////////app bar/ burger icon
//        Scaffold(
//            topBar = {
//                if (!isMenuExpanded) { // Hide the app bar when the menu is expanded
//                    TopAppBar(
//                        title = { Text(text = selectedItem) },
//                        navigationIcon = {
//                            IconButton(onClick = { isMenuExpanded = !isMenuExpanded }) {
//                                Icon(
//                                    Icons.Default.Menu,
//                                    contentDescription = "Menu"
//                                )
//                            }
//                        },
//                        actions = {
//                            // "Notification" icon in the app bar
//                            NotificationIcon(notificationCount)
//                        }
//                    )
//                }
//            },
//
//
//            ) {
//
//            //////////////////////Hamburger content and Content Item Color
////            Row(
////                modifier = Modifier
////               //     .fillMaxSize()
////                    .background(color = Color.White),
////                //  verticalAlignment = Alignment.CenterVertically
//
////            ) {
//
//            Column(
//                modifier = Modifier.fillMaxSize()
//            ) {
//                Spacer(modifier = Modifier.height(50.dp))
//                when (selectedItem) {
//                    "Vision Mission and Values" -> VMG()
//                    "Dashboard" -> DashboardContent()
//                    "Online Payment" -> PaymentContent()
//                    "Announcement" -> AnnouncementContent()
//                    "Enroll Course" -> EnrollCourseContent()
//                    "Class Schedule" -> ClassScheduleContent()
//                    "Online Databases" -> ClassScheduleContent()
//                    "SPR" -> ClassScheduleContent()
//                    "Evaluation" -> ClassScheduleContent()
//                    "Promissory Note" -> ClassScheduleContent()
//                    "Scholarship" -> ClassScheduleContent()
//                    "Excess Option" -> ClassScheduleContent()
//                    "Tuition Payments" -> ClassScheduleContent()
//                    "Payment History" -> ClassScheduleContent()
//                    "All" -> ClassScheduleContent()
//                    "Submit a feedback" -> ClassScheduleContent()
//                    "Academic Services" -> ClassScheduleContent()
//                }
//            }
//
//
//            // Side navigation menu
//            Column(
//                modifier = Modifier
//                    .fillMaxHeight()
//                    .verticalScroll(rememberScrollState())
//                    .width(
//                        animateDpAsState(
//                            targetValue = if (isMenuExpanded) 250.dp else 0.dp,
//                            label = "Expand Container Animation"
//                        ).value
//                    )
//
//                    // .background(color = MyColor.myDirtyWhite.copy(alpha = 0.5f)) tranparentcy
//                    .background(color = MyColor.myDirtyWhite)
//                    .padding(16.dp)
//                    .alpha(
//                        animateFloatAsState(
//                            targetValue = if (isMenuExpanded) 1f else 0f,
//                            animationSpec = tween(), label = "Animation"
//                        ).value
//                    )
//                    .offset(y = animateDpAsState(targetValue = if (isMenuExpanded) 0.dp else (-16.dp)).value)
//            ) {
//
//
//                //Title
//                DrawerHeader()
//
//
//                items.forEach { item ->
//                    SideNavigationItem(
//                        text = item,
//                        isSelected = item == selectedItem,
//                        isIconSelected = item == selectedItem,
//                        onItemClick = {
//                            selectedItem = item
//                            isMenuExpanded = false
//                        },
//                        icon = when (item) {
//                            "Vision Mission and Values" -> iconVisionMission
//                            "Dashboard" -> iconDashboard
//                            "Online Payment" -> iconOnlinePayment
//                            "Announcement" -> iconAnnouncement
//                            "Enroll Course" -> iconEnrollCourse
//                            "Class Schedule" -> iconClassSchedule
//                            "Online Databases" -> iconClassSchedule
//                            "SPR" -> iconClassSchedule
//                            "Evaluation" -> iconClassSchedule
//                            "Promissory Note" -> iconClassSchedule
//                            "Scholarship" -> iconClassSchedule
//                            "Excess Option" -> iconClassSchedule
//                            "Tuition Payments" -> iconClassSchedule
//                            "Payment History" -> iconClassSchedule
//                            "All" -> iconClassSchedule
//                            "Submit a feedback" -> iconClassSchedule
//                            "Academic Services" -> iconClassSchedule
//                            else -> null
//                        }
//                    )
//
//
//                }
//
//            }
//        }
//
//        // Main content area
//
//        //       }
//
//    }
//}
//
//
//@Preview
//@Composable
//fun Preview1() {
//
//    MainPage1()
//}
//
//
//
//
