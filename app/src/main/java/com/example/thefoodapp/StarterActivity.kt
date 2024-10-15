package com.example.thefoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.thefoodapp.R

class StarterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_starter)

        findViewById<Button>(R.id.btnAddStarter1).setOnClickListener {
            Cart.addItem("Garlic Bread", 5)
        }

        findViewById<Button>(R.id.btnAddStarter2).setOnClickListener {
            Cart.addItem("Caesar Salad", 7)
        }

        findViewById<Button>(R.id.btnAddStarter3).setOnClickListener {
            Cart.addItem("Tomato Soup", 6)
        }
    }
}

