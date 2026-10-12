package multilevelInheritance;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c= new ChildClass();
		int g= c.method1(4,6);
		System.out.println(g);
		c.method2();
		c.method3();

	}
	public void method3()
	{
		System.out.println("This is the final class");
	}
}
