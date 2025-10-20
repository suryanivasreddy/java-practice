package com.codegnan.controlstatements;

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int accountBalance=s.nextInt();
		String accountStatus=(accountBalance>=1000)?"Good Standing":(accountBalance>=500)?"Low Balance":"Account Overdrawn";
		System.out.println(accountStatus);
		s.close();
			
	}

}
/*Bank Account Status Check
Problem:
 Write a Java program to check the account balance and classify it:
"Good Standing" if the balance is greater than or equal to $1000
"Low Balance" if the balance is between $500 and $999
"Account Overdrawn" if the balance is less than $500
*/