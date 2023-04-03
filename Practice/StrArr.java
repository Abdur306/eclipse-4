package Practice;

//import java.util.Arrays;
import java.util.*;;

public class StrArr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String temp1="";
		String temp2="";
		
		System.out.println("1st size");
		int n=s.nextInt();
		String str1[]=new String[n];
		System.out.println("1st elements");
		for(int i=0;i<n;i++) {
			str1[i]=s.next();
		temp1+=str1[i];
		}
		
		
		System.out.println("2st size");
		int m=s.nextInt();
		String str2[]=new String[m];
		System.out.println("2nd elements");
		for(int i=0;i<m;i++) {
			str2[i]=s.next();
			temp2+=str2[i];	
		}
		if(temp1.equals(temp2)) {
			System.out.println("True");
		}
		else
			System.out.println("false");
		}
	}
