package Practice;

import java.util.*;

public class Snial2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size");
       int n=s.nextInt();
       int a[][]=new int[n][n];
       for(int i=0;i<n;i++) {
    	for(int j=0;j<n;j++) {
    		a[i][j]=s.nextInt();
    	}
       }
       int rs=0,cs=0;
       int re=n-1,ce=n-1;
       while(rs<=re && cs<=ce) {
    	for(int i=rs;i<=re;i++)
    		System.out.print(a[rs][i]+" ");
    	rs++;
    	for(int i=rs;i<=re;i++)
         System.out.print(a[i][ce]);
    	ce--;
    	for(int i=ce;i>=cs;i--)
    		System.out.print(a[re][i]);
       
       re--;
       for(int i=re;i>=rs;i--)
    	   System.out.print(a[i][cs]);
       cs++;
       }
	}
}
