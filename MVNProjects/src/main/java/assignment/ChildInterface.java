package assignment;

public class ChildInterface implements Parent, Grandparent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInterface c=new ChildInterface();
		c.grandparentMethod();
		c.parentMethod();
		c.childMethod();
	}

	@Override
	public void grandparentMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is grandparent method");
	}

	@Override
	public void parentMethod() {
		// TODO Auto-generated method stub
		System.out.println("This is parent method");
	}
	public void childMethod()
	{
		System.out.println("This is child method");
	}
}
