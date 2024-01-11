package conditions;

import access1.Access1Class1;

public class SimpleIF extends Access1Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1Class1 oo=new Access1Class1();
		System.out.println(oo.abc);
		
		int a=100;
		if(a>500)
		{
			System.out.println("a value is less than 500");
		}
		
		int b=0;
		
		if(b!=0)
		{
		System.out.println(10/b);
	
		}
		else
		{
			b++;
			System.out.println(10/b);
			
		}
	}
}
