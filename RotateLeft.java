package Day15practice;

import java.util.Scanner;

public class RotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
int i=0;
for(i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
System.out.println("student IDs before left shift:");
for(i=0;i<n;i++) {
	if(i!=0)
		System.out.print(",");
	System.out.print(arr[i]);
}
int temp=0;
System.out.println("\n students IDs after left shift:");
for(i=0;i<n;i++) {
	if(i==0) {
		 temp=arr[0];}
	else {
		arr[i-1]=arr[i];
	}
	
}
arr[i-1]=temp;
for(i=0;i<n;i++) {
	if(i!=0)
		System.out.print(",");
	System.out.print(arr[i]);
}
s.close();
	}

}


/*

Rotate Student IDs Left
Scenario:
The college administration stores student IDs in order of registration. To balance class sections,
 the IDs need to be rotated left, so the first student moves to the last.

Testcase-1:
Input: [1, 2, 3]
Output: [2, 3, 1]

Testcase-2:
Input: [5, 11, 9]
Output: [11, 9, 5]

Testcase-3:
Input: [7, 0, 0]
Output: [0, 0, 7]
		*/