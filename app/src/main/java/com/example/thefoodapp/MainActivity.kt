package com.example.thefoodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare the menuItems list globally to be accessible in your activity
    private val menuItems = listOf(
        MenuItem("Garlic Bread", 5, "Starter"),
        MenuItem("Caesar Salad", 7, "Starter"),
        MenuItem("Tomato Soup", 6, "Starter"),
        MenuItem("Margherita Pizza", 12, "Main Course"),
        MenuItem("Grilled Chicken", 15, "Main Course"),
        MenuItem("Veggie Burger", 10, "Main Course"),
        MenuItem("Chocolate Cake", 5, "Dessert"),
        MenuItem("Ice Cream", 4, "Dessert"),
        MenuItem("Fruit Salad", 6, "Dessert")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val averagePriceText: TextView = findViewById(R.id.averagePriceText)

        // Navigate to Starter Activity and show average price
        findViewById<Button>(R.id.btnStarters).setOnClickListener {
            startActivity(Intent(this, StarterActivity::class.java))
            showAveragePrice("Starter", averagePriceText)
        }

        // Navigate to Main Course Activity and show average price
        findViewById<Button>(R.id.btnMainCourse).setOnClickListener {
            startActivity(Intent(this, MainCourseActivity::class.java))
            showAveragePrice("Main Course", averagePriceText)
        }

        // Navigate to Dessert Activity and show average price
        findViewById<Button>(R.id.btnDesserts).setOnClickListener {
            startActivity(Intent(this, DessertActivity::class.java))
            showAveragePrice("Dessert", averagePriceText)
        }

        // Navigate to Cart Activity
        findViewById<Button>(R.id.btnViewCart).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }


        // Navigate to MenuManagementActivity
        findViewById<Button>(R.id.btnMenuManagement).setOnClickListener {
            startActivity(Intent(this, MenuManagementActivity::class.java))
        }

        // Navigate to FilterActivity
        findViewById<Button>(R.id.btnFilterActivity).setOnClickListener {
            startActivity(Intent(this, FilterActivity::class.java))
        }
    }

    private fun showAveragePrice(course: String, averagePriceText: TextView) {
        val courseItems = menuItems.filter { it.course == course }
        val averagePrice = if (courseItems.isNotEmpty()) {
            courseItems.map { it.price }.average()
        } else {
            0.0
        }
        averagePriceText.text = "Average Price for $course: $${"%.2f".format(averagePrice)}"
    }

    private fun calculateAverage(course: String): Double {
        val courseItems = menuItems.filter { it.course == course }
        return if (courseItems.isNotEmpty()) {
            courseItems.map { it.price }.average()
        } else {
            0.0
        }
    }
}

