package com.codegnan.fundmentals;

import java.util.Scanner;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Base of the Triangle :");
		double base=scanner.nextDouble();
		System.out.println("Enter Height of the Triangle :");
		double height = scanner.nextDouble();
		double area=0.5*base*height;
		System.out.println("Area of Triangle : "+area);
		scanner.close();
	}

}
