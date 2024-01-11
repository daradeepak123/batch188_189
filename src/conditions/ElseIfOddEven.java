package conditions;

import java.util.Scanner;

public class ElseIfOddEven {
	
	
	public static void oddEven(int a)
	{
		if(a%2==0)
		{
		
			System.out.println(a+" is even numnber");
		}
		else
		{
			System.out.println("Given number is odd");
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		
		oddEven(a);
		
		

	}

}
