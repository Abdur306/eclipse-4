package Practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String word="";
		String rev="";
		str+=" ";
System.out.print(rev(str, rev, word, 0));
	
	}
	public static String rev(String str,String rev,String word,int index) {
		if(index==str.length())
			return rev;
		
		char c=str.charAt(index);
		if(c!=32)
			return rev(str, rev, word+c, index+1);
		else
			
		return rev(str, word+" "+rev,"", index+1);
	}

}
