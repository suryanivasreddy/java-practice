package com.codegnan.fundmentals;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float r = s.nextFloat();
		float area = r * r * 22 / 7;
		System.out.printf("%.2f", area);
		s.close();
	}

}
