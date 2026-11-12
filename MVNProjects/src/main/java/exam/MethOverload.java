package exam;

public class MethOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethOverload m=new MethOverload();
		m.method(5,6);
		m.method("Hello");
		m.method(2, "Hi");
	}

	public void method(int a, int b)
	{
		int sum = a + b;
		System.out.println("Sum of two integers: " + sum);
		
	}
	
	public void method(String a)
	{
		
		System.out.println(a);
		
	}
	public void method(int a, String b)
	{
		
		System.out.println("Integer: "+a+" String: "+b);
	}
	
	
}
