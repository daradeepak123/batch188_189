package stringPractical;

import java.util.Scanner;

public class PalindromCHeck {
	
	
	public static String revString(String str1)
	{
		String rev1="";
		
		for(int i=0;i<str1.length();i++)
		{
			rev1=str1.charAt(i)+rev1;
		}		
		return rev1;
	}
	
	public static void compare(String s,String ss)
	{
		if(s.equalsIgnoreCase(ss))
		{
			System.out.println("GIven string is a palindrom");
		}
		else
		{
			System.out.println("GIven string is not a palindrom");
		}
		
	}
	
	

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter desired String");
		String str=sc.next();
		String rev=revString(str);
		compare(str,rev);
		
		

	}

}
