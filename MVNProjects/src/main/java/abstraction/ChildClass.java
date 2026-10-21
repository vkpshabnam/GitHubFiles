package abstraction;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass c=new ChildClass();
		c.method1();
		c.method2();
		c.method3();
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is an abstract class");
		
	}
	
	public void method3()
	{
		System.out.println("This is a child class isntance method");
	}

}
