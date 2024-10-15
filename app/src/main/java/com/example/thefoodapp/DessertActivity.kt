package com.example.thefoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.thefoodapp.Cart
import com.example.thefoodapp.R

class DessertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert)

        findViewById<Button>(R.id.btnAddDessert1).setOnClickListener {
            Cart.addItem("Chocolate Cake", 5)
        }

        findViewById<Button>(R.id.btnAddDessert2).setOnClickListener {
            Cart.addItem("Ice Cream", 4)
        }

        findViewById<Button>(R.id.btnAddDessert3).setOnClickListener {
            Cart.addItem("Fruit Salad", 6)
        }
    }
}
