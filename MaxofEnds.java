package Day15practice;

import java.util.Scanner;

public class MaxofEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=0;
int[] arr=new int[n];
for(i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int max=0;
for(i=0;i<n;i++) {
	if(max<arr[i]) {
		max=arr[i];}
}
if(arr[0]==max || arr[n-1]==max)
	for(i=0;i<n;i++) {
		arr[i]=max;
	}

for(i=0;i<n;i++) { 
	if(i!=0)
		System.out.print(",");

	System.out.print(arr[i]);
}
s.close();
	}

}



/*
Set All to Maximum of Ends
Scenario:
Given marks of a student in three tests, if the first or last test score is higher, make all elements equal to that maximum value.

Testcase-1:
Input: [1, 2, 3]
Output: [3, 3, 3]

Testcase-2:
Input: [11, 5, 9]
Output: [11, 11, 11]

Testcase-3:
Input: [2, 11, 20]
Output: [20, 20, 20]
		
		*/