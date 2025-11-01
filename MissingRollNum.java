package Day15practice;

import java.util.Scanner;

public class MissingRollNum {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int[] arr=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int j=0;
		
		for(i=arr[0];i<n+arr[0];i++) {
			if(i!=arr[j])
				break;
			j++;
		}
		System.out.println("Missing number: "+i);
	}

}


/*

Question 1: Missing Roll Number
Scenario:
In a classroom, students have roll numbers stored in an array. However, one roll number is missing in the sequence. Write a program to find the missing roll number assuming the roll numbers are consecutive starting from 1.

Testcase-1:
Input: [1, 2, 4, 5]
Output: Missing number: 3

Testcase-2:
Input: [2, 3, 5, 6]
Output: Missing number: 4

Testcase-3:
Input: [10, 11, 13, 14]
Output: Missing number: 12

*/