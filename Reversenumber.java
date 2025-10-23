  package com.codegnan.controlstatements;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int reverse=0;
int n=N;
while(n>0) {
	reverse=reverse*10;
	reverse=reverse+n%10;
	n=n/10;
}

	System.out.println(reverse);

	}

}
/*Reverse Number – Mirror Number App

Scenario:
A mirror app reverses any number entered by the user.

Sample Input:
1234

Sample Output:
4321

Test Cases:

testcase-1
Input: 9876
Output: 6789

testcase-2
Input: 120
Output: 21

testcase-3
Input: 1001
Output: 1001*/