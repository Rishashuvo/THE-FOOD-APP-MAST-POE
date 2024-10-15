package com.example.thefoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.thefoodapp.Cart
import com.example.thefoodapp.R

class MainCourseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_course)

        findViewById<Button>(R.id.btnAddMainCourse1).setOnClickListener {
            Cart.addItem("Margherita Pizza", 12)
        }

        findViewById<Button>(R.id.btnAddMainCourse2).setOnClickListener {
            Cart.addItem("Grilled Chicken", 15)
        }

        findViewById<Button>(R.id.btnAddMainCourse3).setOnClickListener {
            Cart.addItem("Veggie Burger", 10)
        }
    }
}
