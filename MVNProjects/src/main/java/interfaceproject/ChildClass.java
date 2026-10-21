package interfaceproject;

public class ChildClass implements ParentInt{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass c=new ChildClass();
		c.method1();
		c.method2();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is an interface method");
		
	}
	public void method2()
	{
		System.out.println("This is a child class method");
	}

}
