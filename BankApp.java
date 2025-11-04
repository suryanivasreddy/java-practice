package com.codegnan.oopprograms;

public class BankApp {

	public static void main(String[] args) {
		
		BankAccount acc1=new BankAccount();
		
		acc1.createAccount("surya",553, 5000);
		acc1.deposit(500);
		acc1.withdraw(600);
		acc1.displayAccountInfo();
		BankAccount acc2=new BankAccount();
		acc2.createAccount("Nivas", 3550, 6000);
		acc2.deposit(800);
		acc2.withdraw(500);
		acc2.displayAccountInfo();
		
		
	
		
	}

}
