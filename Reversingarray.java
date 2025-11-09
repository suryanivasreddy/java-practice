package Day21practice;

import java.util.Scanner;

public class Reversingarray {
public static void reverse(int[] arr,int start,int end) {
	if(start>=end)
		return;
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	reverse(arr,start+1,end-1);
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		reverse(arr,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}


/*

At CodeChallenge, programmer Sarah is building a Java program to reverse an array.
 She needs a recursive method to swap elements from the ends inward, reducing the problem size in each call.
The method should:
Handle base cases (empty or single-element arrays)
Be called from main() to process inputs
Recursively swap elements and move inward


With a coding contest nearing, Sarah needs this method to be correct and efficient.
 Input Format
First line: An integer n (array size, 0 ≤ n ≤ 100)
Second line: n space-separated integers (array elements)
 Output Format
n space-separated integers: reversed array


 Testcases
Testcase 1
Input
5
10 20 30 40 50
Output
50 40 30 20 10

Testcase 2
Input
4
1 2 3 4
Output
4 3 2 1

Testcase 3
Input
1
99
Output
99

*/