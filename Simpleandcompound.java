package com.codegnan.fundmentals;

import java.util.Scanner;

public class Simpleandcompound {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double principle=s.nextDouble();
double Interest=s.nextDouble();
double time=s.nextDouble();
time=time/12;
double simpleInterestAmount=principle*Interest*time/100;
double Amount=principle;
double compoundAmount;
for(int i=0;i<time;i++) {
	compoundAmount=Amount*Interest/100;
	Amount=Amount+compoundAmount;
}
System.out.println("Interest rate per year is "+time);

System.out.println("The simple Interest Amount="+simpleInterestAmount+"\nThe Total Amount= "+ (principle+simpleInterestAmount));
System.out.println("The Compound Interest Amount="+(Amount-principle)+"\nThe Total Amount= "+ (Amount+principle));
s.close();
	}
}
