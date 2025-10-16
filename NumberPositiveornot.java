package com.codegnan.operatorexamples;

import java.util.Scanner;

public class NumberPositiveornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int number=s.nextInt();
if(number>0) {
	System.out.println("The number "+number+" is positive number");
}
else if(number<0){
	System.out.println("The number "+number+" is negitive number");
}
else {
	System.out.println("The number "+number+" is zero");
}
s.close();
	}

}
