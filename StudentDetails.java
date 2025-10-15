package com.codegnan.fundmentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner student=new Scanner(System.in);
System.out.print("Enter the Student Name: ");
String name=student.nextLine();
System.out.print("Enter the Student RollNo: ");
int rollNo=student.nextInt();
System.out.print("Enter the Student Marks: ");
int marks=student.nextInt();
System.out.print("Enter the Student Grade: ");
String grade=student.next();
System.out.println("Student Name  : "+name);
System.out.println("Student Rollno: "+rollNo);
System.out.println("Student Marks : "+marks);
System.out.println("Student Grade : "+grade);
student.close();
	}

}
