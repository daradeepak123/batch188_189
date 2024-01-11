package conditions;

import java.util.Scanner;

public class LadderIF {
	
	
	
	public void ladderIfLearn(int marks)
	{
		if(marks>500 && marks<=600)
		{
			System.out.println("You got vacation ");
			
		}
		else if(marks<=500 && marks >=400)
		{
			System.out.println("you got a bicycle");
		}
		else if(marks<400 && marks>=300)
		{
			System.out.println("you got a dress");
		}
		else if(marks <300 && marks>=0)
		{
			System.out.println("Education discontinued");
		}	
		else
		{
			System.out.println("Enter marks between 0-600 only");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LadderIF lf=new LadderIF();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks");
		int mark=sc.nextInt();
		lf.ladderIfLearn(mark);
		

	}

}
