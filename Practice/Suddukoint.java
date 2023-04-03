package Practice;

import java.util.Scanner;

public class Suddukoint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int table[][]=new int[9][9];
		for(int i=0;i<9;i++)
		for(int j=0;j<9;j++)
			table[i][j]=s.nextInt();
		Set(table);
}
	public static void Set(int a[][]) {
		if(Backtrack(a, 0, 0))
			print(a);
		else
			System.out.println("No-solution");
	}
	
	public static boolean Backtrack(int a[][],int r,int c) {
		if(r==9) {
			c++;
		if(c==9)
			return true;
		else
		  r=0;
		}
		if(a[r][c]!=0) {
			return Backtrack(a,r+1,c);
		}
		for(int i=1;i<=9;i++) {
			if(solve(a,r,c,i)) {
				a[r][c]=i;
		if(Backtrack(a, r+1, c)) {
			return true;
		}
		a[r][c]=0;
			}
		}
		return false;
		
	}
	private static boolean solve(int[][] a, int r, int c, int num) {
         	int i,j=0;
         	for(i=0;i<9;i++) {
         		if(a[i][c]==num) {
         			return false;
         		}
         		for(i=0;i<9;i++) {
         			if(a[r][i]==num) {
         				return false;
         			}
         		}
         	}
         	int cin=(c/3)*3;
         	int rin=(r/3)*3;
         	for( i=0;i<3;i++) {
         	for( j=0;j<3;j++) {
         		if(a[rin+i][cin+j]==num)
         			return false;
         	}
         	}
		return true;
	}
	public static void print(int a[][]) {
		for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	}
}
