package Day15practice;

import java.util.Scanner;

public class CommonStartorEnd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the noof bus stops for bus1:");
		int b1=s.nextInt();
		System.out.println("Enter the stop numbers of bus1:  ");
		int[] bus1arr=new int[b1];
		int i=0;
		for( i=0;i<b1;i++) {
			bus1arr[i]=s.nextInt();
		}
		System.out.println("Enter the noof bus stops for bus2:");
		int b2=s.nextInt();
		System.out.println("Enter the stop numbers of bus2:  ");
		int[] bus2arr=new int[b2];
		
		for( i=0;i<b2;i++) {
			bus2arr[i]=s.nextInt();
		}
		
		if(bus1arr[0]==bus2arr[0] || bus1arr[b1-1]==bus2arr[b2-1])
			System.out.println(true);
		else
			System.out.println(false);
		s.close();
	}

}

/*

Common Start or End
Scenario:
Two bus routes are represented by arrays of stop numbers. Return true if both routes start or end at the same stop.

Testcase-1:
Input: a = [1, 2, 3], b = [7, 3]
Output: true

Testcase-2:
Input: a = [1, 2, 3], b = [7, 3, 2]
Output: false

Testcase-3:
Input: a = [1, 2, 3], b = [1, 3]
Output: true
---------------
*/