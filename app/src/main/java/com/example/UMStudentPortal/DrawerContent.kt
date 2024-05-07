package com.example.UMStudentPortal

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.UMStudentPortal.ui.theme.MyColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerContent(
    items: List<String>,
    onItemSelect: (String) -> Unit,
) {

    val iconVisionMission = ImageVector.vectorResource(R.drawable.icon_school)
    val iconDashboard = ImageVector.vectorResource(R.drawable.icondashboard)
    val iconOnlinePayment = ImageVector.vectorResource(R.drawable.iconpayment)
    val iconAnnouncement = ImageVector.vectorResource(R.drawable.icon_announcement)
    val iconEnrollCourse = ImageVector.vectorResource(R.drawable.iconenroll)
    val iconClassSchedule = ImageVector.vectorResource(R.drawable.iconclass)

    var selectedItem by remember { mutableStateOf("Dashboard") }


    ModalDrawerSheet() {
        Column(
            modifier = Modifier
                .background(color = MyColor.myDirtyWhite)
                .clip(shape = RoundedCornerShape(topEnd = 10.dp, bottomEnd = 10.dp))
                .fillMaxHeight()
                .padding(20.dp)
                .requiredWidth(250.dp)
                .verticalScroll(rememberScrollState()),


            // verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            DrawerHeader()  //Header

            Spacer(modifier = Modifier.height(15.dp))
            items.forEach { item ->
                SideNavigationItem(
                    text = item,
                    isSelected = item == selectedItem,
                    isIconSelected = item == selectedItem,
                    onItemClick = {
                        selectedItem = item
                        onItemSelect(item)
                    },

                    icon = when (item) {
                        "Vision Mission and Values" -> iconVisionMission
                        "Dashboard" -> iconDashboard
                        "Online Payment" -> iconOnlinePayment
                        "Announcement" -> iconAnnouncement
                        "Enroll Course" -> iconEnrollCourse
                        "Class Schedule" -> iconClassSchedule
                        "Online Databases" -> iconClassSchedule
                        "SPR" -> iconClassSchedule
                        "Evaluation" -> iconClassSchedule
                        "Promissory Note" -> iconClassSchedule
                        "Scholarship" -> iconClassSchedule
                        "Excess Option" -> iconClassSchedule
                        "Tuition Payments" -> iconClassSchedule
                        "Payment History" -> iconClassSchedule
                        "All" -> iconClassSchedule
                        "Submit a feedback" -> iconClassSchedule
                        "Academic Services" -> iconClassSchedule
                        else -> null
                    }


                )
            }
        }

    }
}
