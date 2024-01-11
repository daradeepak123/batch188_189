package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import stringPractical.StringReverse;

public class SetReverseString {
	
	public Set<String> reverseString(Set<String> s)
	{
		
		Set<String> str=new HashSet<>();
		StringReverse sr=new StringReverse();
		for(String ss:s)
		{
			str.add(sr.revLogic(ss));
		}
		
	
		return str;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> str=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter desired value");
			str.add(sc.next());
		}
		
		SetReverseString srs=new SetReverseString();
		Set<String> sss=srs.reverseString(str);
		
		for(String s:sss)
		{
			System.out.println(s);
		}
		

	}

}
