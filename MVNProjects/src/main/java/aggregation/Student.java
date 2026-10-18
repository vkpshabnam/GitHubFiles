package aggregation;

public class Student {

	int x;
	int y;
	School s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School x= new School();
		x.method1(3, 4);
		Student t=new Student();
		t.method(5, 9, x);
		t.print_meth();
		
	}
	public void method(int x, int y, School s)
	{
		this.x=x;
		this.y=y;
		this.s=s;
	}
	public void print_meth()
	{
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		System.out.println(" a = "+s.a);
		System.out.println(" b = "+s.b);
	}

}
