package Day8practice;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
float N=s.nextInt();
long x=(long)Math.sqrt(N);
if(x*x==N) {
	System.out.println("Perfect Square");
}
else {
	System.out.println("Not a perfect square");
}
s.close();
	}

}
/*Write a Java program to check whether a given number is a Perfect Square using nested if–else statements.
 A number n is said to be a Perfect Square if there exists an integer x such that x × x = n.

Test Case 1:
Input:
16
Output:
Perfect Square


Test Case 2:
Input:
12
Output:
Not Perfect Square


Test Case 3:
Input:
0
Output:
Perfect Square


Test Case 4:
Input:
25
Output:
Perfect Square


Test Case 5:
Input:
-9
Output:
Not Perfect Square'*/