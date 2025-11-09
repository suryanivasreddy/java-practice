package Day21practice;

import java.util.Scanner;

public class SearchSys {
public static boolean search(int[] arr,int n,int t) {
if(n==0)
	return false;
if(arr[n]+arr[n-1]==t)
	return true;
return search(arr,n-1,t);

}
	public static void main(String[] args) {

Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) {
	arr[i]=s.nextInt();
}
int t=s.nextInt();
boolean c=search(arr,n-1,t);
if(c)
	System.out.println("found");
else
	System.out.println("not found");

	}

}
