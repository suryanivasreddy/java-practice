package com.codegnan.controlstatements;

import java.util.Scanner;

public class Positiveornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int num=s.nextInt();
System.out.println((num<0)?"Negaitve Number":"Positive Number");
s.close();
	}

}
/*Checking Whether a Number is Positive, Negative, or Zero
Problem:
 Write a Java program to check if a given number is positive, negative, or zero using a ternary operator.*/