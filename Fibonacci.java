package com.codegnan.controlstatements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int n0=0;
		int n1=1;
		int temp;
		
		System.out.print(n0+" ");
		System.out.print(n1+" ");
		N=N-2;
		while(N>0) {
			temp=n1;
			n1=n1+n0;
			n0=temp;
			System.out.print(n1+" ");
			N--;
		}
	}

}
/* Fibonacci Series – Nature Sequence Generator

Scenario:
A biology simulator models growth patterns using Fibonacci numbers.

Sample Input:
7
Sample Output:
0 1 1 2 3 5 8


Test Cases:

testcase-1
Input: 5
Output: 0 1 1 2 3

testcase-2
Input: 8
Output: 0 1 1 2 3 5 8 13

testcase-3
Input: 10
Output: 0 1 1 2 3 5 8 13 21 34*/