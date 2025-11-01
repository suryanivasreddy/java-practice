package Day15practice;

import java.util.Scanner;

public class Doublearrayoforiginal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		int i=0;
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int[] backUparr=new int[n*2];
		for(i=0;i<n*2;i++) {
			backUparr[i]=0;
			if(i==n*2-1)
				backUparr[i]=arr[n-1];
		}
		for(i=0;i<n*2;i++) {
			if(i!=0)
				System.out.print(", ");
			else
				System.out.print("[");
			System.out.print(backUparr[i]);
		}
		System.out.print("]");
	}

}




/*
Extend Array and Keep Last Value
Scenario:
The company wants to create a backup array double the original size. All new elements should be 0 except the last element, which should match the last element of the original array.

Testcase-1:
Input: [4, 5, 6]
Output: [0, 0, 0, 0, 0, 6]

Testcase-2:
Input: [1, 2]
Output: [0, 0, 0, 2]

Testcase-3:
Input: [3]
Output: [0, 3]
		
		*/