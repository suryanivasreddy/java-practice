package Day18practice;

public class MenuItemManagement {


private String item;
private double price;
private String category;

MenuItemManagement(String item ,double price ,String category){
	
	
	if(item==null||item.isEmpty()) {
		throw new IllegalArgumentException("Item Name can not be empty");
		
	}
	if(price<=0.0) {
		throw new IllegalArgumentException("Price must be positive");
	}
	if(category==null||category.isEmpty()) {
		throw new IllegalArgumentException("Category can not be empty");
	}
	this.item=item;
	this.price=price;
	this.category=category;
	
}

public void displayItemDetails() {
	System.out.println("Item: ["+this.item+"],  Price : ["+this.price+"], Category: ["+this.category+"]");
	
}


}




/*

 Tasty Bites Restaurant – Menu Item Management
Question:
 Tasty Bites Restaurant is digitizing its menu.
 Each item has a name, price, and category (e.g., Appetizer, Main Course).
 Validate:
Name and Category must not be empty or null


Price must be positive
 Throw an exception if invalid.
 Display details in format:
 Item: [name], Price: [price], Category: [category].


Testcase-1
Input:
Spring Rolls
5.99
Appetizer

Output:
Item: Spring Rolls, Price: 5.99, Category: Appetizer

 Testcase-2
Input:
Pasta
0.0
Main Course

Output:
Error: Price must be positive

Testcase-3
Input:
Cheesecake
6.99
Dessert

Output:
Item: Cheesecake, Price: 6.99, Category: Dessert

*/