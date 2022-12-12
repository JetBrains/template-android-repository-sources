package com.example.templateandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.templateandroidproject.ui.theme.ColorBackground
import com.example.templateandroidproject.ui.theme.ColorText
import com.example.templateandroidproject.ui.theme.TemplateAndroidProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TemplateAndroidProjectTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = ColorBackground
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                                .padding(bottom = 128.dp, end = 24.dp),
                            painter = painterResource(R.drawable.space_dev),
                            contentDescription = getString(R.string.template_screen_logo_description),
                        )
                        Text(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            text = getString(R.string.template_screen_title),
                            color = ColorText,
                            fontSize = 17.sp
                        )
                    }
                }
            }
        }
    }
}
