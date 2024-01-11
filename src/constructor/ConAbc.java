package constructor;

public class ConAbc extends ConstructorBasic{
	
	ConAbc()
	{
		System.out.println("this is child constructor");
	}
	
	ConAbc(int x)
	{
		System.out.println(x);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String str="welcome to Java";

		String str1="Java";
		
		
		
		
		
		char c[]=str.toCharArray();
		
		for(char cc:c)
		{
			System.out.println(cc);
		}
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		
		
		String words[]=str.split("");
		for(String s:words)
		{
			System.out.println(s);
		}
		
		
		
		
		

	}

}
