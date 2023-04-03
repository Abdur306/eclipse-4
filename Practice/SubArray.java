package Practice;

import java.util.*;
class SubArray{
public static void main(String []abu){
Scanner s=new Scanner(System.in);
System.out.println("Size");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
boolean res=true;
int count=0;
System.out.println("enter the target");
int target=s.nextInt();
for(int i=0;i<n;i++){
int total=0;
for(int j=i;j<n;j++){
	total+=a[j];
	if(total==target){
	    count++;
		res=false;
    for(int k=i;k<=j;k++)
     System.out.println(a[k]+" ");		
	}
}
}
if(res)
	System.out.println("not found");
else
System.out.println("Possibilities : "+count);
}
}
