package com.codegnan.controlstatements;

import java.util.Scanner;

public class PalindromeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int upperLimit=scanner.nextInt();
int currentNumber=1;//iterate form 1 to n.
int palindromeCount=0;//to store no.of palindromes.
while(currentNumber<=upperLimit) {
	int originalNumber=currentNumber;//keep the original number.
	int numberToReverse=originalNumber;//temprary variable for reversing.
	int reversedNumber=0;//store reversed number.
	 while(numberToReverse>0) {
		 int lastDigit=numberToReverse%10;
		 reversedNumber=reversedNumber*10+lastDigit;
		 numberToReverse=numberToReverse/10;
		 
	 }
	 if(originalNumber==reversedNumber) {
		 palindromeCount++;
	 }
	 currentNumber++;
	
	
}
System.out.println(palindromeCount);
scanner.close();

	}

}
