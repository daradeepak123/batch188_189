package stringPractical;

public class CountAlphaNumberSpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="@pple is a fru!t present! in 10000 b@xes";
		
		int alphaCount=0;
		int numbercount=0;
		int SPecialCharcount=0;
		for(int i=0;i<str.length();i++)
		{
			
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alphaCount++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				numbercount++;
			}
			else
			{
				SPecialCharcount++;
			}
			
			
		}
		System.out.println("Alphabets are " + alphaCount);
		System.out.println("num are " + numbercount);
		System.out.println("Special chars are " + SPecialCharcount);
		

	}

}
