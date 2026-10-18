package assignment7;

public class ChildClass extends ParentClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass c=new ChildClass();
		c.division1();
		
	
	}
	public void division1()
	{
		
		
		int x=super.add1(15, 11);
		if(x % 10== 0)
		{
		System.out.println("The number is divisible by 10");
		}
		else
		{
			System.out.println("This number is not divisible by 10");
		}
	}

}
