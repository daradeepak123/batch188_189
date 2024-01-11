package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetLearn {

	public static void main(String[] args) {

		List<String > sstr=new ArrayList<>();
		
		for(int i=0;i<100;i++)
		{
			sstr.add("hello1");
		}
		for(String s:sstr)
		{
			System.out.println(s);
		}
		
		System.out.println("-----------This is Set from here");
		Set<String> str=new HashSet<>(sstr);
		
		str.add("hello");
		str.add("hello");
		str.add("Hello");
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		
		

	}

}
