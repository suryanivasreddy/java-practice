package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number " + number + " is even number");
		} else {
			System.out.println("The number " + number + " is odd number");
		}
		s.close();
	}

}
