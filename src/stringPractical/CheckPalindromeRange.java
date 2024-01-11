package stringPractical;

public class CheckPalindromeRange {

	public static void main(String[] args) {

		int min=100,max=1000,num=max-min;
		
		int a[]=new int[num];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=min++;
		}
		
		for(int aa:a)
		{
			
			String s=String.valueOf(aa).toString();
			
			String rev="";
			for(int i=0;i<s.length();i++)
			{
			rev=s.charAt(i)+rev;	
			}
			if(s.equals(rev))
			{
				System.out.println(aa + " is a palindrome number");
			}
			else
			{
				System.out.println(aa + " is not a palindrome number");
			}
			
			
			
		}
		
		
		
		
		

	}

}
