package com.codegnan.controlstatements;

import java.util.Scanner;

public class Digitscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int count=0;
		while(N>0) {
			N=N/10;
			count++;
		}
System.out.println(count);
	}

}
/* Count Digits – Mobile PIN Analyzer

Scenario:
A mobile app checks how many digits are in the entered PIN.

Sample Input:
78956

Sample Output:
5


Test Cases:

testcase-1
Input: 1234
Output: 4

testcase-2
Input: 9
Output: 1

testcase-3
Input: 100000
Output: 6*/