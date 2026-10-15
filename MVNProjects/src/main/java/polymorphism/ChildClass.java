//runtime polymorphism
package polymorphism;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ChildClass c=new ChildClass();
	//	c.method1();
		ParentClass p=new ChildClass();
		p.method1();
	}
	public void method1()
	{
		super.method1();
		System.out.println("This is a child class method");
	}

}

