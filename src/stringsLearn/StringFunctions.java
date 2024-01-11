package stringsLearn;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		String str="helllllo   ";
		String ss="hello";
		String s=new String("hellO");
		System.out.println(str.charAt(0));
		System.out.println(str);
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(2));
		System.out.println(str.compareTo("hell"));
		System.out.println(str.concat(ss));
		System.out.println(ss.contains(str));
		System.out.println(str.contentEquals(ss));
		System.out.println(str.endsWith("hellO"));
		System.out.println(str.equals(s));
		System.out.println(str.equalsIgnoreCase(ss));
		System.out.println(str.indent(3));
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf(2, 3));
		System.out.println(str.intern());
		System.out.println(str.isBlank());
		String aasaa="";
		System.out.println(aasaa.isBlank());
		System.out.println(str.isEmpty());

		System.out.println(str.indexOf('l'));
		System.out.println(str.lastIndexOf('l'));
		System.out.println(str.length());
		System.out.println(str.matches("\\w*"));
		System.out.println(str.offsetByCodePoints(0, 5));
		System.out.println(str.repeat(2));
		System.out.println(str.replace('l', 'a'));
		System.out.println(str.replaceFirst("helllllo", "a"));
		System.out.println(str.startsWith("h"));
		System.out.println(str);
		System.out.println(str.strip());
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
		System.out.println();
		
		char ch[]=str.toCharArray();
		for(char sa:ch)
		{
			System.out.println(sa);
		}
		
		System.out.println(str.trim());
		System.out.println();
		String sentance="Learn java in Ramana Soft";
		String arr[]=sentance.split(" ");
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String upperCases=str.toUpperCase();
		System.out.println(upperCases);
		
		

	}

}
