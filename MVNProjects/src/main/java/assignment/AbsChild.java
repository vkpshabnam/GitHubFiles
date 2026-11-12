package assignment;

public class AbsChild extends AbsParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsChild a=new AbsChild();
		a.print1();
		a.print2();
		a.print3();
	}

	@Override
	public void print1() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method");
	}
	public void print3()
	{
		System.out.println("This is non-abstract method");
	}

}
