package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new LinkedList<>();
		a.add(500);
		
		for(int i=1;i<=100;i++)
		{
			a.add(i);
		}
		for(int i=1;i<=100;i++)
		{
			a.add(i);
		}
		
		a.remove(0);

		
		
		

		
		ArrayList<Integer> ch=new ArrayList<>(a);
		
		
		//ch.removeAll(ch);
		
		ch.remove(100);
		
		for(Integer i:ch)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
