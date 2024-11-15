package com.example.qpproject

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : AppCompatActivity() {
    private lateinit var homeButton:Button
    private lateinit var darkText:TextView
    private lateinit var background:ConstraintLayout
    private lateinit var settingsTxt:TextView
    private var isDark = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        homeButton = findViewById(R.id.homeButton1)
        homeButton.text = "Home"
        darkText = findViewById(R.id.darkMode)
        background = findViewById(R.id.main)
        settingsTxt = findViewById(R.id.SettingsText)

        homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        darkText.setOnClickListener {
            if (!isDark) {
                background.setBackgroundColor(Color.DKGRAY)
                darkText.setTextColor(Color.WHITE)
                settingsTxt.setTextColor(Color.WHITE)
                darkText.setTextColor(Color.WHITE)
                isDark = true;
            }
            if (isDark) {
                background.setBackgroundColor(Color.WHITE)
                darkText.setTextColor(Color.DKGRAY)
                settingsTxt.setTextColor(Color.DKGRAY)
                darkText.setTextColor(Color.DKGRAY)
                isDark = false;
            }
        }


    }
}