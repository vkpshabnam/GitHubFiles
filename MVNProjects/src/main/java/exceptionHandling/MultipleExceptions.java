package exceptionHandling;

public class MultipleExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			int a[]=new int[6];
			a[6]=7/0;		
			
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
	/*	catch(ArithmeticException e)      
		{
			System.out.println(e);
		}
		*/
		
		catch(Exception e) //parent exception
		{
			System.out.println(e);
		}
	}

	
}
