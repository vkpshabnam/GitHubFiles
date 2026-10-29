package assignment;

public class ConstructorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorEx c=new ConstructorEx(4,3);
		ConstructorEx d=new ConstructorEx();

	}
	
	public ConstructorEx()
	{
		System.out.println("This is an example of constructor");
		
	}
	public ConstructorEx(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	
}
