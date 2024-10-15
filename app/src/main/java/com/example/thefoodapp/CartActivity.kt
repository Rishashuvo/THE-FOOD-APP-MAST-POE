package com.example.thefoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.thefoodapp.Cart
import com.example.thefoodapp.R

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cartItemsTextView = findViewById<TextView>(R.id.tvCartItems)
        val totalAmountTextView = findViewById<TextView>(R.id.tvTotalAmount)

        cartItemsTextView.text = Cart.getItems().joinToString("\n")
        totalAmountTextView.text = "Total: $" + Cart.getTotalAmount()
    }
}
