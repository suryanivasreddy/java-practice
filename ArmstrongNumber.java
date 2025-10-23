package com.codegnan.controlstatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int N=s.nextInt();
long sum=0;
int digits=0;
int n=N;
int i=N;
while(n>0) {
	n=n/10;
	digits++;
}

while(i>0) {
	n=i%10;
	long armstrong=(long)Math.pow(n,digits);
	sum=sum+armstrong;
	i=i/10;
}
if(sum==N) {
System.out.println("Armstrong");
}
else {System.out.println("Not armstrong");}
}

}
/* Armstrong Number – Number Magic Game
Scenario:
A number puzzle app checks if a number is an Armstrong number.

Sample Input:
153

Sample Output:
Armstrong Number


Test Cases:

testcase-1
Input: 370
Output: Armstrong Number

testcase-2
Input: 371
Output: Armstrong Number

testcase-3
Input: 123
Output: Not Armstrong*/
