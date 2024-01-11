package stringPractical;

public class StringWordsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentance="mom and dad are going to meet madam";
		
		String words[]=sentance.split(" ");
		
		for(String w:words)
		{
			System.out.println(w);
		}

	}

}
