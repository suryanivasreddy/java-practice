package Day13practice;

public class Pattern_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4, colmun=4;
		for(int i=0;i<row;i++) {
			for(int k=0;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=0;j<colmun-i;j++) {
				System.out.print("* ");
				//System.out.print((j+1)+" ");
				//System.out.print((6-i)+" ");//6-i if i start from 1
				//System.out.print(j+" ");
				//System.out.print((6-j)+" ");//6-j if j start from 1
				//System.out.print((char)(96+i)+" ");
				//System.out.print((char)(96+j)+" ");
			}System.out.println();
		}
	}

}
