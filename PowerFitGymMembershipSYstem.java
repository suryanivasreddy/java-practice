package Day18practice;

import java.util.Scanner;

public class PowerFitGymMembershipSYstem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			String name = scanner.nextLine();
			String type= scanner.nextLine();
			double fee= Double.parseDouble(scanner.nextLine().trim());
			
			GymMembershipSystem user1 = new GymMembershipSystem(name, type, fee);
			user1.displayMembership();
			
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			scanner.close();
		}

	}

	}


/*

PowerFit Gym Membership System
Question:
 PowerFit Gym is launching a membership management system.
 Each membership has a member name, plan type (Basic, Premium, etc.), and monthly fee.
Validations:
Name and plan type cannot be empty
Fee must be positive


If invalid, throw an exception.
 Create a method displayMembership() to show membership details.
Testcases
testcase-1
input
Tom Wilson
Premium
50.0
output
Member: Tom Wilson, Plan: Premium, Fee: 50.0

testcase-2
input
Wilson
Basic
30.0
output
Member: Wilson, Plan: Basic, Fee: 30.0

testcase-3
input
Mark Lee
Standard
0.0
output
Error: Fee must be positive

testcase-4
input
Emma Davis
Basic
25.0
output
Member: Emma Davis, Plan: Basic, Fee: 25.0


*/