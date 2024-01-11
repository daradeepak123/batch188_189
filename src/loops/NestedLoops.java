package loops;

public class NestedLoops {
	
	
	public static void hello()
	{
		int a=1;
		System.out.println(++a);
		System.out.println("This is simple method");
	}
	
	

	public static void main(String[] args) {

		int count=0;
		int upperLoop=0;
		for(int i=5;i<10;i++)
		{
			upperLoop++;
			
			for(int j=0;j<10;j++)
			{
				
				count++;
				
			}
		}
		System.out.println(upperLoop);
		System.out.println(count);

	}

}
