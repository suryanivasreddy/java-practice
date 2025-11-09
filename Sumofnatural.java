package Day21practice;

import java.util.Scanner;

public class Sumofnatural {
public static int sumofn(int n) {
	if(n==0)
		return 0;
	return n+sumofn(n-1);
}
	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int result=sumofn(n);
		System.out.println(result);
	}

}


/*

At StudyWell, teacher Ava is creating a Java program to teach students about summing natural numbers.
 She needs a recursive method to compute the sum of the first n natural numbers
 (e.g., for n = 5 → sum = 1 + 2 + 3 + 4 + 5 = 15).
The method should:
handle the base case (n = 0 → 0),
reduce the problem by adding n to the result of sum(n-1).


Ava wants to call this method from main() to demonstrate to her class.
 With a lesson plan due, Ava needs this method to be clear, correct, and easy to understand.

 Input Format
First line: An integer n (number of terms).
Output Format
An integer: sum of first n natural numbers.


Testcases
Testcase-1
Input
5
Output
15

Testcase-2
Input
10
Output
55

Testcase-3
Input
0
Output
0





*/