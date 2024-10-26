package com.example.qpproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textBox:TextView
    private lateinit var textBox2:TextView
    private lateinit var button1:Button
    private lateinit var textView2:TextView
    private lateinit var button2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wireWidgets()
        textBox.text = "Connected Device:"
        button1.text = "Find My Power Tag"
        textView2.text = "Hello World"
        textBox2.text = "Power Tag"
        button2.text = "Current Location"

    }

    private fun wireWidgets() {
        textBox = findViewById(R.id.textView)
        button1 = findViewById(R.id.button)
        textView2 = findViewById(R.id.textView2)
        textBox2 = findViewById(R.id.textView1)
        button2 = findViewById(R.id.buttonCurr)
    }
}