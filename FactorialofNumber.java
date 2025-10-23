package com.codegnan.controlstatements;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int sum=1;
while(N>0) {
	sum*=N;
	N--;
}
System.out.println(sum);
	}

}
/* Factorial – Combinatorics Calculator
Scenario:
A calculator app computes factorials for permutation formulas.

Sample Input:
5

Sample Output:
120

Test Cases:

testcase-1
Input: 3
Output: 6

testcase-2
Input: 6
Output: 720

testcase-3
Input: 0
Output: 1*/