package com.example.gymteligente

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var counter = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textCounter = findViewById<TextView>(R.id.text_counter)
        val btnIncrease = findViewById<Button>(R.id.btn_increase)
        val btnDecrease = findViewById<Button>(R.id.btn_decrease)
        val btnReset = findViewById<Button>(R.id.btn_reset)


        btnIncrease.setOnClickListener {
            counter++
            textCounter.text = counter.toString()
        }
        btnDecrease.setOnClickListener {
            if (counter > 0){
                counter--
            }
            textCounter.text = counter.toString()
        }
        btnReset.setOnClickListener {
            counter = 0
            textCounter.text = counter.toString()
        }
    }
}