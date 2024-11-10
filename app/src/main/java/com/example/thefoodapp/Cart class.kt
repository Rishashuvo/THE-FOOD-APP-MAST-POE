package com.example.thefoodapp

object Cart {
    private val items = mutableListOf<Pair<String, Int>>()

    fun addItem(itemName: String, itemPrice: Int) {
        items.add(Pair(itemName, itemPrice))
    }

    fun getItems(): List<String> {
        return items.map { it.first }
    }

    fun getTotalAmount(): Int {
        return items.sumOf { it.second }
    }

    fun getAveragePrice(): Double {
        return if (items.isNotEmpty()) {
            items.sumOf { it.second }.toDouble() / items.size
        } else {
            0.0
        }
    }
}
