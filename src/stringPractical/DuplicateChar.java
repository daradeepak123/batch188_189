package stringPractical;

public class DuplicateChar {

	public static void main(String[] args) {


		String str="ManualTesting";
		
		
		System.out.println(str.indexOf('L'));
		System.out.println(str.lastIndexOf('L'));
		
		int a=str.indexOf('L');
		int b=str.lastIndexOf('L');
		
		if(a==b)
		{
			System.out.println("L is not a duplicate character");
			
		}
		else
		{
			System.out.println("L is a duplicate character");
			
		}
		
		
		
		
		
		
		

	}

}
