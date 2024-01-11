package arraysLearn;

public class ArraysCrossMapReverse {

	public static void main(String[] args) {
		
		
		int a[]=new int[10];
		int b[]=new int[a.length];
		for(int i=0;i<10;i++)
		{
			a[i]=i;
		}
		int c=b.length;
		int aa=0;
		for(int aaa:b)
		{
			c--;
			
			b[c]=a[aa];
			aa++;
		}
		
		for(int aaa:b)
		{
			System.out.println(aaa);
		}
		
		
		

	}

}
