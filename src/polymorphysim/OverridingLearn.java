package polymorphysim;

public class OverridingLearn extends OverLoading {

	 public static void add(int a,byte b)
		{
			
			int x=a,y=b,c;
			System.out.println(x+y);
			System.out.println("this is byte");
			
			
		}
	 public void wish()
		{
			System.out.println("this is OR");
		}
	 
	 public static void add()
		{
			
			int x=10,y=10,c;
			System.out.println(x+y);
			System.out.println("this is byte");
			
			
		}
	 
	 
	 public void hi()
	 {
		 wish();
		 super.wish();
	 }
	 
	
	 public void hello()
	 {
		 System.out.println("This is hello method in overriding class");
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverridingLearn o=new OverridingLearn();
		o.wish();
		OverLoading oo=new OverLoading();
		oo.wish();
		add();
		

	}

}
