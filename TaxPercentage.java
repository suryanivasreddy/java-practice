package Day8practice;

import java.util.Scanner;

public class TaxPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int income = s.nextInt();
		int taxPercentage;
		if (income <= 10000) {
			taxPercentage = 0;
		} else {
			if (income <= 50000) {
				taxPercentage = 10;
			} else {
				if (income <= 100000) {
					taxPercentage = 20;
				} else {
					taxPercentage = 30;
				}
			}
		}
		System.out.println(taxPercentage+"%");
		s.close();
	}

}
/*
 * Write a Java program to calculate the tax percentage based on income using
 * nested if–else statements. The program should read an integer income and
 * determine the tax percentage as per the rules below: Income Range (₹) Tax
 * Percentage ≤ 10,000 0% 10,001 – 50,000 10% 50,001 – 100,000 20% > 100,000 30%
 * 
 * 
 * Test Case 1: Input: 5000 Output: 0%
 * 
 * 
 * Test Case 2: Input: 20000 Output: 10%
 * 
 * 
 * Test Case 3: Input: 75000 Output: 20%
 * 
 * 
 * Test Case 4: Input: 120000 Output: 30%
 * 
 * 
 * Test Case 5: Input: 10000 Output: 0%
 */