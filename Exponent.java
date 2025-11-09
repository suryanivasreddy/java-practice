package Day21practice;

import java.util.Scanner;

public class Exponent {
public static int expo(int x, int m) {
if(m==0)
	return 1;
return x*expo(x,m-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int m=s.nextInt();
		int result=expo(x,m);
		System.out.println(result);
		s.close();
	}

}



/*

At MathWorks, student Sophie is developing a Java program to compute powers for her algebra class.
 She needs a recursive method to calculate xⁿ (x raised to the power n),
 where each recursive call reduces the exponent by 1.
The method should:
handle base cases (n = 0 → 1),
ensure results fit within safe limits,
and multiply x by the result of x^(n-1) recursively.


Sophie wants to test multiple inputs using main().
 With a math quiz approaching, she needs this recursive method to be reliable and accurate.

 Input Format
First line: Two integers x and n representing the base and exponent.
 Output Format
A long integer: value of xⁿ.


Testcases
Testcase-1
Input
2 5
Output
32

Testcase-2
Input
3 4
Output
81

Testcase-3
Input
5 0
Output
1


*/