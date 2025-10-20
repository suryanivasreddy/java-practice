package com.codegnan.controlstatements;

import java.util.Scanner;

public class AgeCategorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int age=s.nextInt();
String ageCateg=(age<12)?"Child"
						:(age<=19)?"Teenager"
							:(age<=64)?"Adult"
									:"Senior";
System.out.println(ageCateg);
s.close();
	}

}
/*
 * Q1) Write a Java program that categorizes a person into an age group based on
 * their age using a ternary operator: "Child" if age is less than 12
 * 
 * "Teenager" if age is between 12 and 19 "Adult" if age is between 20 and 64
 * "Senior" if age is 65 or older
 */