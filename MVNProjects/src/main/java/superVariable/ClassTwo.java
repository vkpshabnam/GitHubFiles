package superVariable;

public class ClassTwo extends ClassOne{
	int x=11;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassTwo c=new ClassTwo();
		c.method1();
	}
	public void method1()
	{
		System.out.println(x);
		System.out.println(super.x);
	}

}
