package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		boolean isLeap;
		if (year % 400 == 0) {
			isLeap = true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			isLeap = true;
		} else {
			isLeap = false;
		}
		if (isLeap) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
		s.close();
	}

}
