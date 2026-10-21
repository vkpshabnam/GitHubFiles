package exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int a=10;
		
		int b;
		b=a/0;
		System.out.println(b);
			}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		} 
		finally 
		{
			System.out.println("This is a calculation program");
		}
	}

}
