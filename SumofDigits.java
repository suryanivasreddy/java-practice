package com.codegnan.controlstatements;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int sum=0;

while(N>0) {
	sum=sum+N%10;
	N=N/10;
	
}
System.out.println(sum);
	}

}
/*.Sum of Digits – Digital Sum Finder
Scenario:
A payment app calculates a checksum by summing digits of a transaction ID.

Sample Input:
1234

Sample Output:
10

Test Cases:

testcase-1
Input: 987
Output: 24

testcase-2
Input: 56
Output: 11

testcase-3
Input: 1005
Output: 6*/