package assignment;

public class ChildClass extends ParentClass {

	
	int a;
	int b;
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c=new ChildClass();
		System.out.println(c.add(3,4));

	}
*/
	
	public void printMethod()
	{
		super.print();
		System.out.println("This is multilevel inheritance example");
	}
}
