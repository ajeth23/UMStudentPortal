package com.example.UMStudentPortal.MenuItemContent

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.UMStudentPortal.R
import kotlinx.coroutines.delay


@Composable
fun VMG() {
    // Assuming you have two image resources: image1 and image2
    val image1 = painterResource(R.drawable.vmc)
    val image2 = painterResource(R.drawable.qpo)

    var scaleStateImage1 by remember { mutableStateOf(1f) }
    var offsetStateImage1 by remember { mutableStateOf(Offset(0f, 0f)) }

    var scaleStateImage2 by remember { mutableStateOf(1f) }
    var offsetStateImage2 by remember { mutableStateOf(Offset(0f, 0f)) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 10.dp)

    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            // First image with pinch-to-zoom and dragging
            Image(
                painter = image1,
                contentDescription = "vmc",
                modifier = Modifier

                    .graphicsLayer(
                        scaleX = scaleStateImage1,
                        scaleY = scaleStateImage1,
                        translationX = offsetStateImage1.x,
                        translationY = offsetStateImage1.y
                    )
                    .pointerInput(Unit) {
                        detectTransformGestures { _, pan, zoom, offset ->
                            // Apply zoom and pan transformations to the image
                            scaleStateImage1 *= zoom
                            offsetStateImage1 = offsetStateImage1.plus(pan)
                        }
                    }
            )


            Spacer(modifier = Modifier.height(8.dp))

            // Second image with pinch-to-zoom and dragging
            Image(
                painter = image2,
                contentDescription = "UMqpoimage",
                modifier = Modifier
                    .graphicsLayer(
                        scaleX = scaleStateImage2,
                        scaleY = scaleStateImage2,
                        translationX = offsetStateImage2.x,
                        translationY = offsetStateImage2.y
                    )
                    .pointerInput(Unit) {
                        detectTransformGestures { _, pan, zoom, offset ->
                            // Apply zoom and pan transformations to the image
                            scaleStateImage2 *= zoom
                            offsetStateImage2 = offsetStateImage2.plus(pan)
                        }
                    }
            )

        }

        // Coroutine to animate scale and offset back to original values after user finishes pinching
        LaunchedEffect(scaleStateImage1, offsetStateImage1) {
            if (scaleStateImage1 != 1f || offsetStateImage1 != Offset(0f, 0f)) {
                delay(300) // Wait for 300 milliseconds after the pinch gesture is finished
                scaleStateImage1 = 1f
                offsetStateImage1 = Offset(0f, 0f)
            }
        }

        LaunchedEffect(scaleStateImage2, offsetStateImage2) {
            if (scaleStateImage2 != 1f || offsetStateImage2 != Offset(0f, 0f)) {
                delay(300) // Wait for 300 milliseconds after the pinch gesture is finished
                scaleStateImage2 = 1f
                offsetStateImage2 = Offset(0f, 0f)
            }
        }

    }
}