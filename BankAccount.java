package com.codegnan.oopprograms;

import java.util.Scanner;

public class BankAccount {
	private String accountHolder;
	private long accountNumber;
	private double balance;
/*
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;

	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}
	*/
	
public void createAccount(String accountHolder, long accountNumber ,double balance) {
this.accountHolder=accountHolder;
this.accountNumber=accountNumber;
this.balance=balance;
System.out.println("Account created successfully");
displayAccountInfo();
System.out.println("\n\n");
}
	public void deposit(double depositAmount) {
		
		if (depositAmount % 100 != 0) {
			System.out.println("Please Deposit Multiples of hunderads" + "lile[700,1000,2000]");
		} else {
			if (depositAmount < 500) {
				System.out.println("Please deposit more than 500");
			}

			else {
				balance += depositAmount;
				System.out.println("Deposited:" + depositAmount + " Amount succesfully .new balance:" + balance);
			}
		}
System.out.println("\n\n");
	}

	public void withdraw(double withdrawAmount) { 
		if (withdrawAmount % 100 != 0) {
			System.out.println("Please withdraw Multiples of hunderads" + "like[700,1000,2000]");
		} else {
			if (withdrawAmount < 500) {
				System.out.println("Please withdraw more than 500");
			}

			else {
				if (withdrawAmount < balance) {
					balance -= withdrawAmount;
					System.out.println("Withdrawn" + withdrawAmount + " Amount succesfully .new balance:" + balance);
				} else {
					System.out.println("insufficient funds");
				}
			}
		}
		System.out.println("\n\n");
	}
	public void displayAccountInfo() {
		System.out.println("\n\naccount ditails");
		System.out.println("Account Holder Name:"+accountHolder+"\n"
				+ "Account Number:"+accountNumber+"\n"
						+ "Account Balance:"+balance);
	}
	
	
	
	
	

}

/*
 * 
 * Create a package com.codegnan.oopprograms.
 * 
 * Inside the package, create a class BankAccount with:
 * 
 * Instance variables: accountHolder, accountNumber, and balance.
 * 
 * Methods:
 * 
 * createAccount() — to initialize account details
 * 
 * deposit() — to add money to the account
 * 
 * withdraw() — to withdraw money if sufficient balance exists
 * 
 * displayAccountInfo() — to print account details
 * 
 * Create another class BankApp that contains the main() method.
 * 
 * Create two BankAccount objects (acc1, acc2) and perform deposits,
 * withdrawals, and display their details.
 * 
 * 
 */