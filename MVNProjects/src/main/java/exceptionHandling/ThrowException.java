package exceptionHandling;

public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=8;
		
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Invalid");
		}
	}

}
