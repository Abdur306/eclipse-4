package Practice;

import java.util.Scanner;

public class SpiralPrint {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int cap=2*n-1;
	int size=n;
	int a[][]=new int[n][n];
	int l=0,r=n-1,li=0;
	while(l<n) {
		for(int i=l;i<=r;i++) {
			for(int j=l;j<=r;j++) {
				if(i==l||i==r||j==l||j==r)
				a[i][j]=n;
			}
		}
	l++;r--;n--;
	}
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			System.out.print(a[i][j]+"  ");
		}
		System.out.println();
	}
}
}
