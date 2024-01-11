package stringPractical;

public class StringReverse {
	
	
	public String revLogic(String str)
	{
		String rev="";
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='v')
			{
				ch='m';
			}
			
			rev=ch+rev;
			
		}
		return rev;
		
	}
	
	
	

	public static void main(String[] args) {
		String str="Learn Java";
		
		
		String rev="";
		char ch=' ';
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='v')
			{
				ch='m';
			}
			
			rev=ch+rev;
			
		}
		
		System.out.println(rev.replace('n', '@'));
		
		
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		
		

	}

}
