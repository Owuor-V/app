package com.owuor.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var num1: EditText
    private lateinit var num2: EditText
//    private val num1: Int = 0
//    private val num2: Int = 0
    private lateinit var add: Button
    private lateinit var answer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        num1 = findViewById(R.id.editTextNumber)
        num2 = findViewById(R.id.editTextNumber2)
        add = findViewById(R.id.button)
        answer = findViewById(R.id.textView2)

        add.setOnClickListener {
            val number1 = num1.text.toString().toIntOrNull() ?: 0
            val number2 = num2.text.toString().toIntOrNull() ?: 0
            val sum = number1 + number2
            answer.text = "The answer is: $sum"
        }

    }
}