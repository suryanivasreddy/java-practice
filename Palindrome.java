package com.codegnan.controlstatements;

import java.util.Scanner;

public class Palindrome {

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
if(reverse==N) {
			System.out.println("palindrome");
			
}else {
	System.out.println("not a palindrome");
}
	}

}
/*Palindrome Number – Number Pal Game

Scenario:
A number game rewards players if the entered number reads the same forward and backward.

Sample Input:
121

Sample Output:
Palindrome


Test Cases:

testcase-1
Input: 1221
Output: Palindrome

testcase-2
Input: 123
Output: Not Palindrome

testcase-3
Input: 101
Output: Palindrome*/
