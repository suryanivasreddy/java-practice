package Day8practice;

import java.util.Scanner;

public class BounsofEmpolyees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Performance Score:");
		int performaceScore = s.nextInt();
		System.out.println("Enter the experience in years:");
		int experience = s.nextInt();
		if (performaceScore >= 8) {
			if (experience < 2) {
				System.out.println("30000 salary plus 10% bonus=" + 30000 * 11 / 10);
			} else {
				if (experience <= 5) {
					System.out.println("50000 salary plus 10% bonus="+50000*11/10);
				} else {
					System.out.println("70000 salary plus 10% bonus="+70000*11/10);
				}
			}
			
		}
		else {
			if (experience < 2) {
				System.out.println("30000 salary only No bonus");
			} else {
				if (experience <= 5) {
					System.out.println("50000 salary only No bonus");
				} else {
					System.out.println("70000 salary only No bonus");
				}
			}
		}

	}

}
/*
 * Employee Salary and Bonus Calculation Problem: An employee’s salary is
 * calculated based on their performance, years of experience, and whether they
 * are eligible for a bonus. The rules for the calculation are: Base Salary:
 * Junior (Less than 2 years): ₹30,000 Mid-level (2 to 5 years): ₹50,000 Senior
 * (More than 5 years): ₹70,000
 * 
 * 
 * Bonus: Employees with a performance score of 8 or above get a 10% bonus on
 * their salary.
 */