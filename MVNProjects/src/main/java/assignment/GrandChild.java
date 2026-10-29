package assignment;

public class GrandChild extends ChildClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandChild g=new GrandChild();
		int x=g.add(3,4);
		System.out.println(x);
		g.assign(4,5);
		g.display();
	}
	
	public void assign(int a,int b)
	{
		super.a=a;
		super.b=b;
	}
	public void display()
	{
		System.out.println("a="+super.a+" b="+super.b);
	}

}
