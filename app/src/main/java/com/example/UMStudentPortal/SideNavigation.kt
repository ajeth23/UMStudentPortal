package com.example.UMStudentPortal

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.UMStudentPortal.ui.theme.MyColor


@Composable
fun SideNavigationItem(
    text: String,
    isSelected: Boolean,
    isIconSelected: Boolean,
    onItemClick: () -> Unit,
    icon: ImageVector? = null,
    customColor: Color = MyColor.maron, // You can set a default color if no custom color is provided
    selectedIconColor: Color = Color.White // Specify the color for the icon when it is selected
) {
    val background = if (isSelected) customColor else Color.Transparent
    val textColor = if (isSelected) Color.White else Color.Black
    val iconColor = if (isIconSelected) Color.White else MyColor.maron // Determine the color of the icon based on its selection state

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 8.dp),
        color = background,
        shape = MaterialTheme.shapes.medium
    ) {


        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clickable { onItemClick() }
                .padding(10.dp)
        ) {
            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = iconColor
                ) // Use iconColor as the tint for the icon
                Spacer(modifier = Modifier.width(16.dp))
            }
            Text(text = text, color = textColor, fontSize = 14.sp)
        }
    }
}

