package com.example.qpproject

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){
    private lateinit var devices:TextView
    private lateinit var PowerTag:TextView
    private lateinit var button1:Button

    private lateinit var button2:Button
    private lateinit var settingsBtn:Button;
    private lateinit var backGround1:ConstraintLayout
    var dark:Boolean = false;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        devices = findViewById(R.id.textView)
        button1 = findViewById(R.id.button)

        PowerTag = findViewById(R.id.textView1)
        button2 = findViewById(R.id.buttonCurr)
        settingsBtn = findViewById(R.id.settingsBtn)
        backGround1 = findViewById(R.id.main)
        devices.text = "Connected Device:"
        button1.text = "Find My Power Tag"

        PowerTag.text = "Power Tag"
        button2.text = "Current Location"
        settingsBtn.text = "Settings"

        settingsBtn.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            intent.putExtra("Dark", dark)
            startActivity(intent)
        }

        val intent1 = intent
        val bool1 = intent.getBooleanExtra("DarkMode", false)
        if (bool1) {
            backGround1.setBackgroundColor(Color.DKGRAY)
            devices.setTextColor(Color.WHITE)
            PowerTag.setTextColor(Color.WHITE)
            dark = true;

        }
        else {
            backGround1.setBackgroundColor(Color.WHITE)
            devices.setTextColor(Color.BLACK)
            PowerTag.setTextColor(Color.BLACK)
            dark = false;
        }


    }




    /*private fun wireWidgets() {
        textBox = findViewById(R.id.textView)
        button1 = findViewById(R.id.button)
        textView2 = findViewById(R.id.textView2)
        textBox2 = findViewById(R.id.textView1)
        button2 = findViewById(R.id.buttonCurr)
        SettingsBtn = findViewById(R.id.SettingsBtn)
    }*/
}