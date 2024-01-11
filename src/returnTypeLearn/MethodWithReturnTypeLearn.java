package returnTypeLearn;

public class MethodWithReturnTypeLearn {
	
	
	public int number(int xyz)
	{
		
		int abc=100+800+xyz;
		
		return abc;
		
	}
	
	
	public boolean oddEvenCHeck(int xyz)
	{
		
		int abc=100+800+xyz;
		
		if(abc%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodWithReturnTypeLearn o=new MethodWithReturnTypeLearn();
		
		int abc=o.number(100);
		System.out.println(abc);
		System.out.println(o.number(600));
		
		
		System.out.println(o.oddEvenCHeck(101));
		
		
		
		

	}

}
