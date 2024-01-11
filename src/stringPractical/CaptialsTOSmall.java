package stringPractical;

public class CaptialsTOSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ApPLeIsAFruit";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				System.out.print(Character.toLowerCase(str.charAt(i)));
			}
			else
			{
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
		}
		
		
		
		

	}

}
