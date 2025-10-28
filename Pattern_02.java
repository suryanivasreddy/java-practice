package Day14practice;

public class Pattern_02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=4;
for(int i=0;i<row;i++) {
	for(int j=0;j<row-i;j++) {
		System.out.print("  ");
	}System.out.print("* ");
	for(int k=1;k<=i*2-1;k++) {
		if(i!=0)
		System.out.print("  ");
	}if(i!=0) {
		System.out.print("*");
	}

	System.out.println();
	for(int t=0;i==row-1&&t<row;t++)
		System.out.print(" * *");
}}
}

/*
Print Pyramid Hollow Pattern
       *
     *   *
   *       *
 *           *
* * * * * * * *


*/