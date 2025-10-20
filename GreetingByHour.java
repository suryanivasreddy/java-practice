package com.codegnan.controlstatements;

import java.util.Scanner;

public class GreetingByHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter time (in 24hour format):");
int time=s.nextInt();
String greeting=(time>=5&&time<12)?"Good Morning"
									:(time>=12&&time<17)?"Good Afternoon"
											:(time>=17&&time<22)?"Good Evening"
													:"Good Night";
System.out.println(greeting);
s.close();

	}

}
/*Hour of the Day Greeting
Problem:
 Write a Java program to print a greeting based on the hour of the day using ternary operators:

"Good Morning" if the hour is between 5 AM and 12 PM
"Good Afternoon" if the hour is between 12 PM and 5 PM
"Good Evening" if the hour is between 5 PM and 10 PM
"Good Night" if the hour is between 10 PM and 5 AM*/