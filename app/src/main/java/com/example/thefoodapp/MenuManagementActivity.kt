package com.example.thefoodapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuManagementActivity : AppCompatActivity() {

    private val menuItems = mutableListOf(
        "Garlic Bread", "Caesar Salad", "Tomato Soup", "Margherita Pizza",
        "Grilled Chicken", "Veggie Burger", "Chocolate Cake", "Ice Cream", "Fruit Salad"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_management)

        val tvMenuItems = findViewById<TextView>(R.id.tvMenuItems)
        val btnAddMenuItem = findViewById<Button>(R.id.btnAddMenuItem)
        val btnRemoveMenuItem = findViewById<Button>(R.id.btnRemoveMenuItem)
        val btnBackToMain = findViewById<Button>(R.id.btnBackToMain)

        // Display initial menu items
        updateMenuItems(tvMenuItems)

        // Add a menu item
        btnAddMenuItem.setOnClickListener {
            menuItems.add("New Dish") // Add a new item to the menu
            updateMenuItems(tvMenuItems) // Update the displayed menu items
        }

        // Remove a menu item
        btnRemoveMenuItem.setOnClickListener {
            if (menuItems.isNotEmpty()) {
                menuItems.removeAt(menuItems.size - 1) // Remove the last item
                updateMenuItems(tvMenuItems) // Update the displayed menu items
            }
        }

        // Navigate back to MainActivity
        btnBackToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    // Function to update the displayed list of menu items
    private fun updateMenuItems(tvMenuItems: TextView) {
        tvMenuItems.text = "Menu Items: \n${menuItems.joinToString("\n")}"
    }
}

