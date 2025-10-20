package Day8practice;

import java.util.Scanner;

public class OnlineCartPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Total billing amount:");
		int totalAmount = s.nextInt();
		System.out.println("Is it Festival Season (true/false):");
		boolean festivalSeason = s.nextBoolean();
		System.out.println("premium Membership(true/false):");
		boolean premiumMembership = s.nextBoolean();
		double payableAmount = totalAmount;
		if (totalAmount >= 10000) {
			System.out.println("20% discount applied on Total Billing Amount:" + totalAmount);
			payableAmount=payableAmount*80/100;

		} else {
			if (totalAmount >= 5000) {
				System.out.println("10% discount applied on Total Billing Amount:" + totalAmount);
				payableAmount =payableAmount*90/100;
			}
		}
		
		if (festivalSeason) {
			payableAmount =payableAmount*95/100;
			System.out.println("Additional Festival Season discount of 5% is applied");
		}
		if (premiumMembership) {
			payableAmount =payableAmount-200.00;
			System.out.println("Flat 200 off as you have Premium Membership");
		}
		System.out.println("the final amount after discount to be payable is " + payableAmount);
		
		s.close();
	}

}
/*
 * Online Shopping Cart Price Calculator (With Offers & Membership) Problem
 * Statement: Create a Java program to compute the total bill for a shopping
 * cart. Conditions:
 * 
 * If total amount: is ≥ ₹10,000, apply 20% discount is ≥ ₹5000, apply 10%
 * discount else, no discount If it’s a festival season, apply an extra 5%
 * discount. If the user has a premium membership, apply an additional ₹200 flat
 * discount. Show total price, all applied discounts, and final payable amount.
 */