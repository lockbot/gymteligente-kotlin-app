package com.example.gymteligente

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gymteligente.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var counter = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_main)

//        val textCounter = findViewById<TextView>(R.id.text_counter)
//        val btnIncrease = findViewById<Button>(R.id.btn_increase)
//        val btnDecrease = findViewById<Button>(R.id.btn_decrease)
//        val btnReset = findViewById<Button>(R.id.btn_reset)


        binding.btnIncrease.setOnClickListener {
            counter++
            binding.textCounter.text = counter.toString()
        }
        binding.btnDecrease.setOnClickListener {
            if (counter > 0){
                counter--
            }
            binding.textCounter.text = counter.toString()
        }
        binding.btnReset.setOnClickListener {
            counter = 0
            binding.textCounter.text = counter.toString()
        }
    }
}