package Day21practice;

import java.util.Scanner;

public class Sumofarray {
public static int sumof(int n,int[] arr) {
	if(n==0)
		return arr[n];
	return arr[n]+sumof(n-1,arr);
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int result=sumof(n-1,arr);
System.out.println(result); 
		
	}

}



/*

At DataCorp, analyst Alex is developing a Java program to sum array elements.
 He needs a recursive method to compute the sum of an array by adding the last element to the sum of the remaining elements.
The method should:
Handle base cases (empty array → 0)
Be called from main() to process inputs
Use recursion to reduce array size in each call


With a data project due, Alex needs this method to be efficient and accurate.
Input Format
First line: An integer n (array size, 0 ≤ n ≤ 100)
Second line: n space-separated integers (array elements)


 Output Format
An integer: sum of array elements


Testcases
Testcase 1
Input
5
10 20 30 40 50
Output
150

Testcase 2
Input
3
5 -2 8

Output
11



*/