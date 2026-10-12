package hierachicalInheritance;

public class ChildOne extends ParentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildOne c= new ChildOne();
		c.method1();
		c.method2();
	}
	public void method2()
	{
		System.out.println("This is the first child");
	}

}
