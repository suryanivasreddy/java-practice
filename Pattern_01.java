package Day14practice;

public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=6;
for(int i=0;i<row;i++) {
	for(int j=0;j<row-i;j++) {
		System.out.print(" ");
	}System.out.print("*");
	for(int k=1;k<=i*2-1;k++) {
		System.out.print(" ");
	}if(i!=0) {
		System.out.print("*");
	}

	System.out.println();
	
}
for(int i=row;i>=0;i--) {
	for(int j=0;j<row-i;j++) {
		System.out.print(" ");
	}System.out.print("*");
	for(int k=1;k<=i*2-1;k++) {
		System.out.print(" ");
	}if(i!=0) {
		System.out.print("*");
	}

	System.out.println();
	
}
	}

}



/*
 
          *
         * *
        *   *
       *     *
      *       *
     *         *
      *       *
       *     *
        *   *
         * *
          * 
 
 
 
 
 
 
 
 */
 