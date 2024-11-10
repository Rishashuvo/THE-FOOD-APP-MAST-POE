Changes Made:


MainActivity:

Added buttons to navigate to MenuManagementActivity and FilterActivity.

Displays average prices for different menu categories (Starter, Main Course, Dessert).

MenuManagementActivity:

Allows adding and removing menu items dynamically from a list of predefined items.

Displays the list of current menu items, with functionality to add a new item or remove the last item from the list.

FilterActivity:

Filters menu items based on categories: Starters, Main Course, and Desserts.
Displays filtered menu items in a TextView when corresponding buttons are clicked.

Functionality Updates:

Menu Item Management:

In MenuManagementActivity, a button lets the user add a default menu item (e.g., "New Dish") to the list.

A remove button removes the last item from the list.

Filtering System:
In FilterActivity, buttons are used to display the filtered list of menu items based on category.

The categories include Starters, Main Courses, and Desserts.

How It Works Now:
Navigating Between Activities:
From MainActivity, users can navigate to
 
MenuManagementActivity to manage the menu and FilterActivity to filter items by category.
Dynamic Menu Management:

Users can add and remove items from the menu in MenuManagementActivity.
The list of items updates instantly upon adding/removing an item.

Filtered View:
In FilterActivity, users can filter the menu items by clicking on the buttons corresponding to Starters, Main Courses, or Desserts.

The filtered list of items is displayed dynamically in the TextView.
