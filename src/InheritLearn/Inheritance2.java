package InheritLearn;

public class Inheritance2 extends Inheritance1 {

	
	public void hi()
	{
		System.out.println(a);
		hello();
	}
	
	
	public static void main(String args[])
	{
		Inheritance1 o=new Inheritance1();
		System.out.println(o.a);
		
		
	}
}
