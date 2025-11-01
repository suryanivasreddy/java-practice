package Day15practice;

import java.util.Scanner;

public class Middleofrollno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int[] sec1=new int[3];
int[] sec2=new int[3];

int i=0;
System.out.println("enter sec1 rolls:");
for(i=0;i<3;i++) {
	sec1[i]=s.nextInt();
}
System.out.println("enter sec2 rolls: ");
for(i=0;i<3;i++) {
	sec2[i]=s.nextInt();
}

int[] middlerolls= {sec1[1],sec2[1]};
System.out.println("["+middlerolls[0]+" ,"+middlerolls[1]+" ]");


	}

}



/*

Middle Values of Two Groups
Scenario:
Two sections of students each have three roll numbers. Return an array containing the middle roll number 
from each section.

Testcase-1:
Input: a = [1, 2, 3], b = [4, 5, 6]
Output: [2, 5]

Testcase-2:
Input: a = [7, 7, 7], b = [3, 8, 0]
Output: [7, 8]

Testcase-3:
Input: a = [5, 2, 9], b = [1, 4, 5]
Output: [2, 4]
		
		*/