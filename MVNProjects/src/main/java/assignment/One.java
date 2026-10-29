package assignment;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One.printMethod(3,4,5);
		One.printMethod(19,10);
		One.printMethod("This is the example of method overloading");
		}
	
	public static void printMethod(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void printMethod(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	public static void printMethod(String a)
	{
		System.out.println(a);
	}

}
