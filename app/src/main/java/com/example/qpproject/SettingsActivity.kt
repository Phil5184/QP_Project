package com.example.qpproject

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SettingsActivity : AppCompatActivity(){
    private lateinit var SettingsText1: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_page)
        wireWidgets2()
        SettingsText1.text = "USER ID: Phillip Mai"
    }


    private fun wireWidgets2() {
        SettingsText1 = findViewById(R.id.textView)
    }
}