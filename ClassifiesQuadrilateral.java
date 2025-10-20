package Day8practice;

import java.util.Scanner;

public class ClassifiesQuadrilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
if(a==c&&b==d) {
	if(b==c) {
		System.out.println("Square");
	}
	else {
		System.err.println("Rectangle");
	}
	
}
else {
	System.out.println("Others");
}
s.close();
	}

}
/*A geometry app classifies a quadrilateral based on four side lengths ($a, b, c, d$) and whether opposite sides are equal.
Output "Rectangle" if opposite sides are equal ($a=c$ and $b=d$).
Output "Square" if all sides are equal.
Output "Other" otherwise.
Input Format: Four integers a,b,c,d, separated by spaces.
Output Format: A string: "Square", "Rectangle", or "Other".
Example:
Input: 4 4 4 4
Output: Square


Test Case 1:
Input:
4 4 4 4
Output:
Square


Test Case 2:
Input:
4 6 4 6
Output:
Rectangle


Test Case 3:
Input:
3 4 5 6
Output:
Other


Test Case 4:
Input:
5 5 5 5
Output:
Square


Test Case 5:
Input:
2 3 2 3
Output:
Rectangle*/