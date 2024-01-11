package stringPractical;

public class SentanceFirstCharDuplicated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="mom and dad are going to meet madam in the classc";
		String words[]=str.split(" ");
		for(String ss:words)
		{
			for(int i=0;i<ss.length();i++)
			{
				char ch=ss.charAt(i);

				int a=ss.indexOf(ch),b=ss.lastIndexOf(ch);
				
				if(a==b)
				{
					System.out.println(ss.charAt(i)+ " -->is not getting duplicated in the word-->" +ss);
				}
				else
				{
					System.out.println(ss.charAt(i)+ " -->is getting duplicated in the word-->" +ss);

				}
			}

		}





	}

}
