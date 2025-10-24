package com.codegnan.controlstatements;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int N=s.nextInt();
int i=2;
int j=2;
int count;
while(j<=N) {
	count=0;
	i=2;
	while(i<j) {
		if(j%i==0) {
			count++;
			break;
		}
		i++;
	}
	if(count==0) {
		System.out.print(j+" ");
	}
	j++;
}
	}

}
/*Prime Numbers up to N – Prime Finder Tool

Scenario:
A cryptography app generates prime numbers up to n for key creation.

Sample Input:
10


Sample Output:
2 3 5 7


Test Cases:

testcase-1
Input: 5
Output: 2 3 5

testcase-2
Input: 15
Output: 2 3 5 7 11 13

testcase-3
Input: 20
Output: 2 3 5 7 11 13 17 19

*/