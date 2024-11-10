package com.example.thefoodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FilterActivity : AppCompatActivity() {

    private val starters = listOf("Garlic Bread", "Caesar Salad", "Tomato Soup")
    private val mainCourses = listOf("Margherita Pizza", "Grilled Chicken", "Veggie Burger")
    private val desserts = listOf("Chocolate Cake", "Ice Cream", "Fruit Salad")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filter)

        // Find the TextView for displaying filtered items
        val tvFilteredItems = findViewById<TextView>(R.id.tvFilteredItems)

        // Filter by Starters
        findViewById<Button>(R.id.btnFilterStarters).setOnClickListener {
            tvFilteredItems.text = "Starters: \n${starters.joinToString("\n")}"
        }

        // Filter by Main Course
        findViewById<Button>(R.id.btnFilterMainCourse).setOnClickListener {
            tvFilteredItems.text = "Main Course: \n${mainCourses.joinToString("\n")}"
        }

        // Filter by Desserts
        findViewById<Button>(R.id.btnFilterDesserts).setOnClickListener {
            tvFilteredItems.text = "Desserts: \n${desserts.joinToString("\n")}"
        }

        // Navigate back to MainActivity
        findViewById<Button>(R.id.btnBackToMainFromFilter).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

