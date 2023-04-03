package Practice;

import java.util.Scanner;

class WaterTraped{
	public static void main(String [] abu){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
		a[i]=s.nextInt();
	int res=0;
	for(int i=1;i<n-1;i++){ 
		int left=a[i];
		for(int j=0;j<i;j++){
			left=a[j]>left?a[j]:left;
		System.out.println("left :"+left);
		}
		int right=a[i];
		for(int j=i+1;j<n;j++){
			right=a[j]>right?a[j]:right;
		System.out.println("right :"+right+" a[i]"+a[i]);
		}
	res+=(left<right?left:right)-a[i];	
	}
	System.out.print("Result is :"+res);
	}
	}
		

