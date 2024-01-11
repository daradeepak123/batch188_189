package stringsLearn;

public class Compare2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		String str="welcome to Java";

		String str1="Java";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str.charAt(i)==str1.charAt(j))
				{
					System.out.println("+");					
				}
				else
				{
					System.out.println(str.charAt(i));
				}
			}
			
			
			
		}
		
		
		
		

	}

}
