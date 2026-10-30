package com.hikawati.ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HikawatiScreen()
                }
            }
        }
    }
}

@Composable
fun HikawatiScreen() {
    var showText by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "مرحباً بك في حكاواتي AI 🚀",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Button(onClick = { showText = !showText }) {
            Text(text = if (showText) "إخفاء الرسالة" else "اضغط هنا لتجربة التطبيق")
        }

        if (showText) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "التطبيق يعمل بنجاح! هذه نسخة تجريبية لبناء الواجهات.",
                fontSize = 18.sp
            )
        }
    }
}
