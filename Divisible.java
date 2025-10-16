package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number % 5 == 0) {
			System.out.println("The number " + number + " is divisible by 5.");
		} else {
			System.out.println("The number " + number + " is not divisible by 5.");
		}
		s.close();
	}

}
