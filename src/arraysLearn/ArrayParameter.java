package arraysLearn;

public class ArrayParameter {
	
	
	public static void printEvenNumbers(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" is a even number");
			}
			
		}
		
	}
	
	public static void printOddNumbers(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" is a odd number");
			}
			
		}
		
	}
	
	
	public static void num(int abc)
	{
		System.out.println(abc);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]=new int[100];
		
		for(int i=0;i<number.length;i++)
		{
			number[i]=i+1;
		}
		
		printEvenNumbers(number);
		printOddNumbers(number);
		int x=100;
		num(x);
				
		

	}

}
