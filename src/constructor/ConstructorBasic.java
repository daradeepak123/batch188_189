package constructor;

public class ConstructorBasic {
	
	ConstructorBasic()
	{
		System.out.println("hello this is constructor");
		
	}
	
	ConstructorBasic(int abc)
	{
		
		System.out.println(abc);
	}
	
	
	

	public static void main(String[] args) {
		ConstructorBasic o=new ConstructorBasic();
		ConstructorBasic o1=new ConstructorBasic(50);
		
	}

}
