package com.example.thefoodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.thefoodapp.CartActivity
import com.example.thefoodapp.DessertActivity
import com.example.thefoodapp.MainCourseActivity
import com.example.thefoodapp.StarterActivity
import com.example.thefoodapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Navigate to Starter Activity
        findViewById<Button>(R.id.btnStarters).setOnClickListener {
            startActivity(Intent(this, StarterActivity::class.java))
        }

        // Navigate to Main Course Activity
        findViewById<Button>(R.id.btnMainCourse).setOnClickListener {
            startActivity(Intent(this, MainCourseActivity::class.java))
        }

        // Navigate to Dessert Activity
        findViewById<Button>(R.id.btnDesserts).setOnClickListener {
            startActivity(Intent(this, DessertActivity::class.java))
        }

        // Navigate to Cart Activity
        findViewById<Button>(R.id.btnViewCart).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
    }
}
