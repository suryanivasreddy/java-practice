package com.codegnan.fundmentals;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
double principle=s.nextDouble();
double compoundInterest=s.nextDouble();
double time=s.nextDouble();
double Amount=principle;
double compoundAmount;
for(int i=0;i<time;i++) {
	compoundAmount=Amount*compoundInterest/100;
	Amount=Amount+compoundAmount;
}
System.out.println("The Compound Interest Amount="+(Amount-principle)+"\nThe Total Amount= "+ (Amount+principle));
s.close();
	}

}
