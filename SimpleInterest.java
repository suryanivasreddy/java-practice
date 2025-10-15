package com.codegnan.fundmentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double principle=s.nextDouble();
double simpleInterest=s.nextDouble();
double time=s.nextDouble();
double simpleInterestAmount=principle*simpleInterest*time/100;
System.out.println("The simple Interest Amount="+simpleInterestAmount+"\nThe Total Amount= "+ (principle+simpleInterestAmount));
s.close();
	}

}
