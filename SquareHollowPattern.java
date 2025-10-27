package Day13practice;

public class SquareHollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5, colmun=5;
		for(int i=0;i<=row;i++) {
			if(i==0||i==5) {for(int k=0;k<=row;k++) {
				System.out.print("* ");
			}}else {
			for(int j=0;j<=colmun;j++) {
				if(j==0||j==colmun) {
				System.out.print("* ");
					}
				else
					System.out.print("  ");
					
			}}System.out.println();}
		}
	}

/*
 
* * * * * * 
*         * 
*         * 
*         * 
*         * 
* * * * * *
 
 
 
 */
