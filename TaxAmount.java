package com.codegnan.controlstatements;

import java.util.Scanner;

public class TaxAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double income=s.nextInt();
double taxAmount=(income<300000)?income/20:(income<=1000000)?income/10:income*15/100;
if(income>2000000) {
	taxAmount/=100;
}
System.out.println(taxAmount);
s.close();
	}

}
/*Determine Tax Bracket Based on Income
Problem:
 Write a Java program that computes the income tax based on the user's salary:
If income is less than 300,000, the tax rate is 5%.
If income is between 300,000 and 1,000,000, the tax rate is 10%.
If income is above 1,000,000, the tax rate is 15%.
Additionally, if the income is over 2,000,000, apply a special bonus of 1% on the total tax amount.*/