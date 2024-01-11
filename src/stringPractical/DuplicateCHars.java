package stringPractical;

public class DuplicateCHars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="LearnManualTestingLAutomatedTEstingLLLLLLLLL";
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);					
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println(ch+ " is not a duplicated character");
			}
			else
			{
				System.out.println(ch+ " is a duplicated character");
			}
		}
		
		
		

	}

}
