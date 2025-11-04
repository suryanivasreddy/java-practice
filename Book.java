package com.codegnan.oopprograms;

public class Book {
	private String title;
	private String author;
	private boolean isAvailable;
	Book(String title,String author){
		this.title=title;
		this.author=author;
		this.isAvailable=true;
	}
	public void borrowBook() {
		if(this.isAvailable)
			{this.isAvailable=false;
			System.out.println("book borrowed successfully");}
		else
			System.out.println("book is already borrowed");
	}
	public void returnBook() {
		if(this.isAvailable)
			System.out.println("the book was not borrowed ");
		else
			{this.isAvailable=true;
			System.out.println("the book returned successfully");}
	}
	public void displayInfo() {
		System.out.println("book’s title: "+this.title+"\nauthor : "+this.author+"\navailability status : "+this.isAvailable);
		
	}

}


/*
Java OOP – Library Book Management System
Your Task:
Create a Book class with the following:


Private instance variables: title, author, and isAvailable.
A constructor to initialize the book title and author (availability should be true by default).
A method borrowBook() that:


Changes the availability to false if the book is available.
Prints a message if the book is already borrowed.


A method returnBook() that:


Changes the availability to true if the book was borrowed.
Prints a message if the book was not borrowed.

A method displayInfo() to print the book’s title, author, and availability status.

In your main method (LibrarySystem class):


Create two Book objects with different titles and authors.
Display the information of both books.
Borrow the first book and try to borrow it again (to test availability logic).
Return the first book and try to return it again (to test return logic).
Finally, display the updated information of the first book.

*/