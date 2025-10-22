package Day9practice;

import java.util.Scanner;

public class AwardBonusinCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter option and salary (like 1  50000)\n•	Role Code 1 (Manager)\n"
		+ "•	Role Code 2 (Developer)\n"
		+ "•	Role Code 3 (Intern) ");
int option=s.nextInt();
int salary=s.nextInt();
switch(option) {
case 1:System.out.println(salary*10/100);
break;
case 2:System.out.println(salary*5/100); 
break;
case 3:System.out.println(500);
break;
default:System.out.println("Invalid Role");
}
s.close();	}

}
/*Problem Statement:
A company awards bonuses based on employee role:
•	Role Code 1 (Manager): 10% of salary
•	Role Code 2 (Developer): 5% of salary
•	Role Code 3 (Intern): $500 flat bonus
The user inputs a role code and salary, and the program outputs the bonus amount or "Invalid Role".

Input Format:
Two integers: code and salary, separated by a space.

Output Format:
An integer (bonus amount) or the string "Invalid Role".

Example:
•	Input: 1 50000
•	Output: 5000

Constraints:
•	1 ≤ code ≤ 3
•	1000 ≤ salary ≤ 100000
•	Use a switch statement*/