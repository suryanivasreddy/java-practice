package com.codegnan.controlstatements;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int number=scanner.nextInt();
while(number>=10) {
	int digitSum=0;//variable to store the sum of digits for this round
	while(number>0) {//extract and sum all digits of the current number
		int lastDigit=number%10;
		digitSum+=lastDigit;
		number=number/10;// to remove the last digit
		
	}
	//after suming all digits , set number's to the new sum.
	// and repeat if it still has morethan one digit.
	number=digitSum;
	
}
//when the number becomes a single digit print the result
System.out.println(number);
scanner.close();
	}

}
