package com.example.compose_tutorials.pathway1_compose_essentials

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_tutorials.ui.theme.Compose_TutorialsTheme

@Composable
fun SurfaceTest() {
    Row (
        modifier = Modifier
            .padding(12.dp)
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface,
            shape = RoundedCornerShape(8.dp),
            border = BorderStroke(2.dp, MaterialTheme.colorScheme.surfaceVariant),
            shadowElevation = 8.dp,
            tonalElevation = 8.dp,
        ) {
            Text("Hello Compose")
        }
    }

}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun SurfaceTestPreview() {
    Compose_TutorialsTheme {
        SurfaceTest()
    }
}