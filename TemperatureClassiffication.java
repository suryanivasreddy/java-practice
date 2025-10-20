package com.codegnan.controlstatements;

import java.util.Scanner;

public class TemperatureClassiffication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int temp=s.nextInt();
System.out.println((temp>30)?"Hot":(temp>=15)?"Moderate":"Cold");
s.close();
	}

}
/*Temperature Classification
Problem:
 Write a program using a ternary operator to classify the temperature:
If the temperature is above 30°C, print "Hot".
If the temperature is between 15°C and 30°C, print "Moderate".
Otherwise, print "Cold".*/