package conditions;

import java.util.Scanner;

public class ArmyJobApplicationNestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=sc.next();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your qualification inter or not");
		String quali=sc.next();
		System.out.println("Enter your percentage");
		int perc=sc.nextInt();
		System.out.println("Enter your gender");
		String gender=sc.next();
		System.out.println("Enter your Weight");
		int weight=sc.nextInt();
		System.out.println("enter your height");
		int height=sc.nextInt();
		System.out.println("Enter your mental fitness true/false");
		boolean mFitness=sc.nextBoolean();
		System.out.println("Enter your Physical Fitness true/false");
		boolean pfitness=sc.nextBoolean();
		System.out.println("enter your eyesight");
		int eyeSight=sc.nextInt();
		
		
		if(age>=18 && age<=24)
		{
			if(quali.equalsIgnoreCase("inter"))	
			{
				if(perc>=60)
				{
					if(gender.equals("male"))
					{
						if(height>167) 
						{
							if(weight>80)
							{
								if(mFitness && pfitness)
								{
									System.out.println("YOu are eligible for this job");
								}
								else
								{
									System.out.println("You are not eligible for this job based on mental/phsical fitness");
								}
							}
							else
							{
								System.out.println("you are rejected based in weight");
							}
						}
						else
						{
							System.out.println("you are rejected based on height");
						}
						
					}
					else if(gender.equals("female"))
					{
						if(height>150) 
						{
							if(weight>50)
							{
								if(mFitness && pfitness)
								{
									System.out.println("YOu are eligible for this job");
								}
								else
								{
									System.out.println("You are not eligible for this job based on mental/phsical fitness");
								}
							}
							else
							{
								System.out.println("you are rejected based in weight");
							}
						}
						else
						{
							System.out.println("you are rejected based on height");
						}
						
					}
					else
					{
						System.out.println("you are rejected based on gender");
					}
				}
				else
				{
					System.out.println("Your are not eligible based on your percentage");
				}
			}
			else
			{
					System.out.println("You are not eligible based on your qualification");
			}
		}
		else
		{
			System.out.println("You are rejected based on your age");
		}
		
		
		

	}

}
