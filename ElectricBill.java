package Day8practice;

import java.util.Scanner;

public class ElectricBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the units consumed:");
double units=s.nextDouble();
System.out.println("Enter true if Senior citizen ,if not false");
boolean citizen=s.nextBoolean();
//double bill=(units<=100)?1.50*units:(units<=200)?2.00*units:(units<=300)?3.00*units:5.00*units;
double bill;
if(units<=100) {
	bill=1.5*units;
}
else {
	if(units<=200) {
		bill=2.0*(units-100)+150;
	}
	else {
		if(units<=300) {
			bill=3.0*(units-200)+350;
		}
		else {
			bill=5.0*(units-300)+650;
		}
	}
}
if(bill>1000) {
	bill=bill*110/100;
}
if(citizen) {
	bill=bill*95/100;
}
System.out.println("Electricity bill for "+units+"units is:"+bill);
s.close();
	}

}
/*Electricity Bill Calculator (With Slabs & Surcharge)
 Problem Statement:
Write a Java program to calculate the monthly electricity bill based on the number of units consumed, applying the following slab rates:
Units Consumed
Rate per Unit
0 - 100
₹1.50
101 - 200
₹2.00
201 - 300
₹3.00
Above 300
₹5.00

If the total bill exceeds ₹1000, apply a 10% surcharge.
If the user is a senior citizen, apply an additional 5% discount on the total.*/