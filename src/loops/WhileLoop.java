package loops;

public class WhileLoop {
	
	public static void printNumbers(int a)
	{
		int x=a;
		while(x<=100)
		{
			
			System.out.println(x);
			x++;
		}		
	}
	
	public void doWhile(int a)
	{
		int x=a;
		do {
			
			System.out.println(x);
			x++;
			
		}while(x<100);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop wl=new WhileLoop();
		
		printNumbers(100);
		wl.doWhile(1000);
		

	}

}
