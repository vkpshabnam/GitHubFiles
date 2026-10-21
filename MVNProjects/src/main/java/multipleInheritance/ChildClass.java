package multipleInheritance;

public class ChildClass implements ParentOne, ParentTwo{

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
		System.out.println("This is parent one");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is parent two");
		
	}
	
	public void method3()
	{
		System.out.println("This is a child class method");
	}

}
