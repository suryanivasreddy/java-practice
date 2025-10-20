package com.codegnan.controlstatements;

import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int totalAmount=s.nextInt();
int discount=(totalAmount>=1000)?20:(totalAmount>=500)?10:0;
System.out.println("The "+discount+"% discount applied on Total Amount:"+totalAmount);
System.out.println("The Total after discount is:"+totalAmount*(100-discount)/100);
s.close();
	}

}
/*
Q2) 2. Discount Calculation
Problem:
 Write a Java program to apply a discount based on the total shopping amount using a ternary operator:
20% discount if the total amount is greater than or equal to 1000
10% discount if the total amount is between 500 and 999
No discount if the amount is less than 500*/