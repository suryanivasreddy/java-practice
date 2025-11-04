package com.codegnan.oopprograms;

public class LibrarySystem {

	public static void main(String[] args) {
		Book b1=new Book("the Rise","surya");
		Book b2=new Book("the Rule","suku");
		b1.displayInfo();
		b2.displayInfo();
		b1.borrowBook();
		b1.borrowBook();
		b1.displayInfo();
		b1.returnBook();
		b1.returnBook();
		b1.displayInfo();
		

	}

}
