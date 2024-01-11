package polymorphysim;

public class OverLoading {
	
	
	
	public void wish()
	{
		System.out.println("this is OL");
	}
	
	
	public static void add()
	{
		int a=100, b=400,c;
		c=a+b;
		System.out.println(c);
	}
	public static void add(int z)
	{
		int a=100, b=400,c;
		c=a+b+z;;
		System.out.println(c);
	}
	
	
	public static void add(int a,int b)
	{
		
		int x=a,y=b,c;
		System.out.println(x+y);
		System.out.println("this is int");
		
	}
	
	
	 static void add(int a,byte b)
	{
		
		int x=a,y=b,c;
		System.out.println(x+y);
		System.out.println("this is byte");
		
		
	}
	
	
	
	 
	
	 
	 public void hello()
	 {
		 System.out.println("this is hello method in overloading class");
	 }
	
	  
	 
	 
	 

	public static void main(String[] args) {
		byte b=100;
		add();
		add(50);
		add(10,b);
	}

}
