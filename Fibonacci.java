package Day21practice;

import java.util.Scanner;

public class Fibonacci {
public static int fibonac(int n) {
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	return fibonac(n-1)+fibonac(n-2);
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sr=fibonac(n);
		System.out.println(sr);
		

	}

}


/*

At CodeCamp, learner Mia is creating a Java program to generate Fibonacci numbers for a sequence project.
 She needs a recursive method to compute the nth Fibonacci number, where each number is the sum of the two preceding ones:
F(0) = 0  
F(1) = 1  
F(n) = F(n-1) + F(n-2)

The method should handle base cases and ensure results fit within constraints.
 Mia wants to call this method from main() to test multiple inputs.
 The recursive approach should break down the problem into smaller subproblems.
 With a coding contest approaching, Mia needs this method to be correct and efficient.

 Input Format
First line: An integer n (index in Fibonacci sequence).


 Output Format
A long integer: nth Fibonacci number.



 Testcases
Testcase 1
Input
5
Output
5

Testcase 2
Input
10
Output
55

Testcase 3
Input
0
Output
0

*/