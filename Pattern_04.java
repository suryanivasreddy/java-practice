package Day14practice;

public class Pattern_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row=5;
char A='A';
for(int i=0;i<row;i++) {
	for(int j=0;j<=i;j++) {
		System.out.print(A);
		A++;
	}System.out.println();
}
	}

}

/*

Floyd's Triangle (Letters)
A
BC
DEF
GHIJ
KLMNO


*/