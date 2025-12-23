# Inventory Management System (OOP Project)

A simple Java console application to manage products, stock levels, and basic supplier/order info.

## Features
- Add product
- Remove product
- Update stock
- Search product by id
- Display low stock products
- Display all products

## OOP Concepts Used
- Encapsulation
- Inheritance (Product → PerishableProduct)
- Interface (Storable)
- Composition (Inventory has Products, StockManager uses Inventory)

## Project Structure
- Product
- PerishableProduct
- Supplier
- Inventory
- StockManager
- Order
- Main
- Storable (interface)

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure a Java SDK is selected.
3. Run the `Main` class.
4. Use the console menu to interact with the system.

## Menu Usage Example

When the program starts, the following menu is displayed:

1. Add product
2. Remove product
3. Update stock
4. Search product
5. Show low stock products
6. Show all products


Example flow:
- Choose option 1 to add a new product
- Enter product id, name, price, and stock quantity
- Use option 6 to display all products
