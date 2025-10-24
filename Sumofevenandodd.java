package com.codegnan.controlstatements;

import java.util.Scanner;

public class Sumofevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int  evenSum=0;
int oddSum=0;
while(N>0) {
	if(N%2==0) {
		evenSum=evenSum+N;
	}
	else {
		oddSum=oddSum+N;
	}
	N--;
}
System.out.println("Sum of even numbers:"+evenSum);
System.out.println("Sum of odd numbers:"+oddSum);
	}

}
/*Sum of Even and Odd Numbers – Statistics Analyzer

Scenario:
An analytics app finds the total of even and odd numbers up to a limit n.

Sample Input:
10


Sample Output:
Sum of even numbers: 30
Sum of odd numbers: 25


Test Cases:

testcase-1
Input: 5
Output:
Sum of even numbers: 6
Sum of odd numbers: 9

testcase-2
Input: 8
Output:
Sum of even numbers: 20
Sum of odd numbers: 16

testcase-3
Input: 3
Output:
Sum of even numbers: 2
Sum of odd numbers: 4

*/