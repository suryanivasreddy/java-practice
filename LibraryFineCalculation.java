package Day9practice;

import java.util.Scanner;

public class LibraryFineCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("select an option from below options based on days of overdue:");
System.out.println("1.  1 to 5 days.");
System.out.println("2.  6 to 10 days.");
System.out.println("3.  more than 10 days.");
int option=s.nextInt();
System.out.println("Enter the days overdue:");
int overdueDays=s.nextInt();
switch(option) {
case 1:System.out.println(overdueDays*1);
break;
case 2:System.out.println((overdueDays-5)*2+5);
break;
case 3:System.out.println((overdueDays-10)*5+15);
break;
default:System.out.println("Invalid code.");
}
s.close();
	}

}
/*A library system calculates fines based on days overdue:
•	Code 1: 1–5 days → $1/day
•	Code 2: 6–10 days → $2/day
•	Code 3: >10 days → $5/day
The user inputs a code and days overdue, and the program outputs the total fine or "Invalid Code".

Input Format:
Two integers: code and days, separated by a space.

Output Format:
An integer (total fine) or the string "Invalid Code

Example
•	Input: 1 3
•	Output: 3

Constraints:
•	1 ≤ code ≤ 3
•	1 ≤ days ≤ 30
•	Use a switch statement*/