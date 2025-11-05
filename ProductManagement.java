package Day18practice;

public class ProductManagement {

private String name;
private double price;
private int quantity;

ProductManagement(String name,double price ,int quantity){
	
	
	if(name==null||name.isEmpty()) {
		throw new IllegalArgumentException("Name can not be empty");
		
	}
	if(price<=0) {
		throw new IllegalArgumentException("price must be positive");
	}
	if(quantity<=0) {
		throw new IllegalArgumentException("Quantity must be non-negative");
	}
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	
}

public void displayProduct() {
	System.out.println("Product: "+this.name+",  Price: "+this.price+", Quantity: "+this.quantity);

}
}


/*

ShopEasy Product Management System
Question:
 Emma runs an online store called ShopEasy, selling electronics.
 To manage customer orders, she needs a Java class Product to represent items in the cart.
 Each product has a name, price, and quantity available.
The constructor should initialize these attributes and validate that:
Name is not empty


Price is positive


Quantity is non-negative


If any input is invalid, throw an exception.
 Create a method displayProduct() to show the product details.
 Emma wants the system to handle bulk orders efficiently and display product information clearly for customers browsing her website.
Testcases
testcase-1
input
Laptop
999.99
5
output
Product: Laptop, Price: 999.99, Quantity: 5

testcase-2
input
cell
499.99
10
output
Product: cell, Price: 499.99, Quantity: 10

testcase-3
input
Phone
0.0
8
output
Error: Price must be positive

testcase-4
input
Tablet
299.99
-1
output
Error: Quantity must be non-negative

testcase-5
input
Headphones
79.99
20
output
Product: Headphones, Price: 79.99, Quantity: 20


*/