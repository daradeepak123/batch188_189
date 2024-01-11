package conditions;

import java.util.Scanner;

public class EleBilling {

	public static void main(String[] args) {
	
		
		BaseELeLogic ele=new BaseELeLogic();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterlast month Reading");
		int lastMonthReading=sc.nextInt();
		int currentMonthReading;
		do
		{
		System.out.println("Enter current month reading");
		currentMonthReading=sc.nextInt();
		}while(lastMonthReading>currentMonthReading);
		
		
		int units=currentMonthReading-lastMonthReading;
		
		System.out.println("enter your area type of living urban/town/village");
		String type=sc.next();
		
		ele.eleBilling(units, type);

	}

}
