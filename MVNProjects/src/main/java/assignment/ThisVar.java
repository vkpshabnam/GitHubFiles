package assignment;

public class ThisVar {

	int a;
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisVar v=new ThisVar();
		v.method(3,4);
		v.printMethod();

	}
	
	public void method(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void printMethod()
	{
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
	}

}
