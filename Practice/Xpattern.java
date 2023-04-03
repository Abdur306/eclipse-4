package Practice;

import java.util.Scanner;

public class Xpattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size :");
		int n = s.nextInt();
		print(n);
		System.out.println();
		//print1(n);
		
	}
	public static void print(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print((j+1)+" ");
				}
				
				else if(n==i+j+1) {
					System.out.print((i+1)+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println((char)1);
	}
	}


