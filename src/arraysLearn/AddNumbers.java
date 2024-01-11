package arraysLearn;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[]=new int[5];


		for(int i=0;i<abc.length;i++)
		{
			abc[i]=i;

		}

		for(int i=0;i<abc.length;i++)
		{
			if(abc[i]%2==0)
			{
				System.out.println(abc[i] + " is a even number");
			}
			else
			{
				System.out.println(abc[i] + " is a odd number");
			}
		}
	}
}
