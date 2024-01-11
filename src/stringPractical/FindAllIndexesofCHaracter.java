package stringPractical;

public class FindAllIndexesofCHaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="LearnManualTestingLAutomatedTEstingLLLLLLLLL";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='L')
			{
				System.out.println("L is present at this index " +i);
				count++;
			}
			
			
			
		}
		System.out.println("L occurance is "+ count);
		
		
		
		
		

	}

}
