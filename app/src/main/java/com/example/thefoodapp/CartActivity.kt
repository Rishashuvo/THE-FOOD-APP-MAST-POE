package com.example.thefoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val cartItemsTextView = findViewById<TextView>(R.id.tvCartItems)
        val totalAmountTextView = findViewById<TextView>(R.id.tvTotalAmount)
        val averageAmountTextView = findViewById<TextView>(R.id.tvAverageAmount)

        cartItemsTextView.text = Cart.getItems().joinToString("\n")
        totalAmountTextView.text = "Total: $" + Cart.getTotalAmount()
        averageAmountTextView.text = "Average Price: $" + String.format("%.2f", Cart.getAveragePrice())
    }
}
