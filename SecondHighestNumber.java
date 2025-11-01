package Day15practice;

import java.util.Scanner;

public class SecondHighestNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		int n2,n1;
		n1=n2=0;
		int[] arr=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
			if(n1<arr[i]) {
				n2=n1;
				n1=arr[i];
				
			}
			if(n2<arr[i]&&arr[i]<n1) {
				n2=arr[i];
			}
		}
		System.out.println("Second highest Score: "+n2);
	}

}



/*
Second Highest Score
Scenario:
During a cricket match, runs scored by each batsman are stored in an array. The coach wants to find the second highest score.

Testcase-1:
Input: [50, 75, 100, 25]
Output: Second highest score: 75

Testcase-2:
Input: [120, 80, 90, 60]
Output: Second highest score: 90

Testcase-3:
Input: [33, 45, 67, 67, 21]
Output: Second highest score: 45

*/