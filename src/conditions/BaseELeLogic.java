package conditions;

public class BaseELeLogic {
	
	
	
	
	public void eleBilling(int units, String type)
	{
		
		if(type.equals("urban"))
		{
			
			if(units<100 && units>1)
			{
				System.out.println("YOu need to pay " + units*5);
				
			}
			else if (units>=100 && units<=200)
			{
				System.out.println("YOu need to pay " + units*7.5);
				
			}
			
			else if (units>200 && units<=400)
			{
				System.out.println("YOu need to pay " + units*10);
				
			}
			else if ( units>=400)
			{
				System.out.println("YOu need to pay " + units*15);
				
			}
			else
			{
				System.out.println("Enter the units properly");
			}
			
		}
		else if(type.equals("town"))
		{
			
			if(units<100 && units>1)
			{
				System.out.println("YOu need to pay " + units*3);
				
			}
			else if (units>=100 && units<=200)
			{
				System.out.println("YOu need to pay " + units*7);
				
			}
			
			else if (units>200 && units<=400)
			{
				System.out.println("YOu need to pay " + units*8);
				
			}
			else if ( units>=400)
			{
				System.out.println("YOu need to pay " + units*10);
				
			}
			else
			{
				System.out.println("Enter the units properly");
			}
			
		}
		else if(type.equals("village"))
		{
			
			if(units<100 && units>1)
			{
				System.out.println("YOu need to pay " + units*2);
				
			}
			else if (units>=100 && units<=200)
			{
				System.out.println("YOu need to pay " + units*4);
				
			}
			
			else if (units>200 && units<=400)
			{
				System.out.println("YOu need to pay " + units*6);
				
			}
			else if ( units>=400)
			{
				System.out.println("YOu need to pay " + units*7);
				
			}
			else
			{
				System.out.println("Enter the units properly");
			}
			
		}
		else
		{
			System.out.println("Enter proper area urban/town/village");
		}
		
		
		
		
		
	}
	
	
	
	
	

}
