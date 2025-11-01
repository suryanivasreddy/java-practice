package Day15practice;

import java.util.Scanner;

public class FirstandLastroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
int i=0;
for(i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int[] arr1= {arr[0],arr[n-1]};
System.out.println("["+arr1[0]+" ,"+arr1[1]+" ]");
	}

}




/*
First and Last Roll Numbers
Scenario:
Given an array of roll numbers, return a new array containing only the first and last roll numbers.

Testcase-1:
Input: [1, 2, 3]
Output: [1, 3]

Testcase-2:
Input: [1, 2, 3, 4]
Output: [1, 4]

Testcase-3:
Input: [7, 4, 6, 2]
Output: [7, 2]
		
		*/