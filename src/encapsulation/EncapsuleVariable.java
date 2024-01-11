package encapsulation;

public class EncapsuleVariable {
	
	
	private static int abc=500;
	
	
	public static void printABC()
	{
		System.out.println(abc);
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}






	public static int getAbc() {
		return abc;
	}






	public static void setAbc(int abc) {
		EncapsuleVariable.abc = abc;
	}

}
