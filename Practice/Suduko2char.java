package Practice;

import java.util.Scanner;

public class Suduko2char {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		char a[][]=new char[n][n];
		for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
			a[i][j]=s.next().charAt(0);
		}
		}
if(Backtrack(a,0,0))
	print(a);
else
	System.out.println("not found");
}
	public static boolean Backtrack(char a[][],int r,int c) {
	if(r==9) {
		c++;
	if(c==9)
		return true;
	else 
		r=0;
	}
	if(a[r][c]!=48) {
		return Backtrack(a, r+1, c);
	}
	for(int i=49;i<=57;i++) {
		if(solve(a,r,c,i)) {
			a[r][c]=(char) i;
		if(Backtrack(a, r+1, c)) {
			return true;
		}
		a[r][c]=48;
		}
	}
		return false;
	}
	
	public static boolean solve(char a[][],int r,int c,int num) {
		int i;int j=0;
		for( i=0;i<9;i++) {
			if(a[i][c]==num) {
				return false;
		}
		for( i=0;i<9;i++) {
				if(a[r][i]==num) {
					return false;
			}
		}
	}
		int cin=(c/3)*3;
		int rin=(r/3)*3;
		for( i=0;i<3;i++) {
		for(j=0;j<3;j++) {
		if(a[rin+i][cin+j]==num) {
			
		return false;
		}
		}
		}
		return true;
	}
	
	public static void print(char a[][]) {
	for(int i=0;i<9;i++) {
	for(int j=0;j<9;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
	}
	}

}
