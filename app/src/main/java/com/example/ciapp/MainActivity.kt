package com.example.ciapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this).apply {
            text = "CI/CD Demo\nВерсия: ${BuildConfig.VERSION_NAME}\nBuild: ${BuildConfig.VERSION_CODE}"
            textSize = 20f
            setPadding(48, 48, 48, 48)
        }
        setContentView(tv)
    }
}
