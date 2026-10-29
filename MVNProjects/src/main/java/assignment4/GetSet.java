package assignment4;

public class GetSet {
	
	static String x;
	static int y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetSet.set("Sam",17);
	
		GetSet.get();

	}
	
	public static void set(String a, int b)
	{
		
		
		 x=a;
		 y=b;
	}
	
	public static void get()
	{
		System.out.println("My name is : "+x);
		System.out.println("My age : "+y);
		
	}

}
