package com.example.ubuntuloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnJoinus = findViewById<Button>(R.id.btnJoinus) as Button

        btnJoinus.setOnClickListener(){
            val Intent = Intent(this,LoginPage::class.java)
            startActivity(Intent)
        }
    }

}