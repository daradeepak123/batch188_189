package loops;

public class PrimeNumber {
	
	
	void primeCHeck(int a)
	{
		int x=a;
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				System.out.println("Given number is not a prime number");
				break;
			}
			else
			{
				System.out.println("Given number is prime number");
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeNumber p=new PrimeNumber();
		
		p.primeCHeck(9);
		
		
		

	}

}
