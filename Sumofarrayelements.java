package Day15practice;

import java.util.Scanner;

public class Sumofarrayelements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		int i=0;
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		for(i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		s.close();
	}

}



/*
Total Marks of Three Students
Scenario:
The marks of three students are given in an array. Write a program to find the total marks obtained.

Testcase-1:
Input: [1, 2, 3]
Output: 6

Testcase-2:
Input: [5, 11, 2]
Output: 18

Testcase-3:
Input: [7, 0, 0]
Output: 7

*/