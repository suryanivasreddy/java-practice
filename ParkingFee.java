package Day8practice;

import java.util.Scanner;

public class ParkingFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.print("Enter the vechicle type ('Car','Bike','Truck'):");
String vehicle=s.next();
System.out.println("Enter the time of arrival (24-hour format, e.g., 14 for 2 PM):");
int in=s.nextInt();
System.out.println("Enter the time of departure (24-hour format, e.g., 18 for 6 PM):");
int out=s.nextInt();
double total=0;
int hours;
if(out>=in) {
	hours=out-in;
}
else {
	hours=24-in+out;
}
if(vehicle.equalsIgnoreCase("Car")) {
	total=50*hours;
}
else{
	if(vehicle.equalsIgnoreCase("Bike")) {
		total=30*hours;
	}
	else {
		if(vehicle.equalsIgnoreCase("truck")) {
			total=100*hours;
		}
		else {
		System.out.println("invalid input");
		return;}
		}
	}


if(hours>5) {
	total=total*80/100;
}

if(in>18||in<8||out>=18||out<8) {
	total=total*150/100;
}


System.out.println("Total parking fee:"+total);
s.close();
	}

}
/*
Problem: Parking Fee Calculation
A parking system calculates the fee based on the following conditions:

Vehicle Type:
Car: ₹50 per hour
Bike: ₹30 per hour
Truck: ₹100 per hour


Discounts:
If the vehicle stays for more than 5 hours, a 20% discount is applied to the total parking fee.

Surcharge:
If the vehicle is parked between 6 PM and 8 AM, a 50% surcharge is applied to the total fee.

Input:
The program should prompt the user to enter the vehicle type (Car, Bike, or Truck).
The user should enter the arrival time (24-hour format, e.g., 14 for 2 PM).
The user should also enter the departure time (24-hour format, e.g., 18 for 6 PM).


Output:
The program should output the total parking fee based on the conditions above.

Constraints:
Assume that the parking times are in a 24-hour format.
Handle cases where parking times cross midnight (e.g., a vehicle parked from 10 PM to 2 AM).
For vehicles staying for more than 5 hours, apply the 20% discount.
For vehicles parked between 6 PM and 8 AM, apply the 50% surcharge.


Example:
Input:
Enter the vehicle type (Car, Bike, Truck): car
Enter the time of arrival (24-hour format, e.g., 14 for 2 PM): 14
Enter the time of departure (24-hour format, e.g., 18 for 6 PM): 20

Output:
Total parking fee: ₹300.0*/