package com.example.cyrilvergara_comp304sec001_lab02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnEnter = findViewById<Button>(R.id.btnEnter);


        btnEnter.setOnClickListener {
            intent = Intent(applicationContext,ProductSelectActivity::class.java)
            startActivity(intent)
        }
    }
}