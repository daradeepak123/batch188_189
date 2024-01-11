package employeeCLassLEarn;

public class Employee {
	
	int empID;
	String empName;
	String designation;
	int sal;
	int age;
	String qul;
	int att;
	static String companyName="RamanaSoft";
	int a,b;
	public void add(int aa,int bb)
	{
		int a=100,b=1000;
		System.out.println(a+b);
	}
	
	
	
	public void displayEmpInformation(int eempID,String eempName,String desig,int ssal,int aage,String qqul,String com)
	{
		System.out.println(empID=eempID);
		System.out.println(empName=eempName);
		System.out.println(designation=desig);
		System.out.println(sal=ssal);
		System.out.println(age=aage);
		System.out.println(qul=qqul);
		System.out.println(companyName);
	}
	
	public void att()
	{
		System.out.println(empName);
		System.out.println(att);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj1=new Employee();
		obj1.displayEmpInformation(101,"Ram","Test Engineet",100000,21,"B.tech","RamanaSoft");
		System.out.println(obj1.empID);
		
		System.out.println("-------------------------");
		Employee obj2=new Employee();
		obj2.att=95;
		obj2.displayEmpInformation(102,"Krish","Test Engineer-II",200000,21,"B.tech","RamanaSoft");
		
		
		obj2.att();

	}

}
