package Day8practice;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the traffic light color('red','yellow','green')");
String light=s.next();
System.out.println("Enter the time(24 hour-format 0-23):");
int time=s.nextInt();
if(light.equalsIgnoreCase("green")) {
	System.out.println("Go");
}
else {
	if(light.equalsIgnoreCase("red")) {
		System.out.println("Stop");
	}
	else {
		
		if(light.equalsIgnoreCase("yellow")) {
			if(time>6&&time<18) {
				System.out.println("Slow");
			}
			else {
				System.out.println("Stop");
			}
		}
	}
}
s.close();
	}

}
/*Write a Java program to simulate traffic light behavior using nested if–else statements.

 The program should take:
A light state (Green, Yellow, or Red)
The hour (0–23 in 24-hour format)
 and display the vehicle’s action based on these rules:

If the light is Green, the action is “Go”.
If the light is Red, the action is “Stop”.

If the light is Yellow:
During daytime (6 AM to 6 PM) → “Slow”
During nighttime → “Stop”


Test Case 1:
Input:
Green 10
Output:
Go


Test Case 2:
Input:
Red 15
Output:
Stop


Test Case 3:
Input:
Yellow 9
Output:
Slow


Test Case 4:
Input:
Yellow 20
Output:
Stop


Test Case 5:
Input:
Green 23
Output:
Go*/