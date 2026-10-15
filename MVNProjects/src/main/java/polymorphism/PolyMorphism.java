package polymorphism;

public class PolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyMorphism p=new PolyMorphism();
		p.method1();
		p.method1(4,5);
		p.method1("This is the third method");
	}
	
	public void method1()
	{
		System.out.println("this is method1");
	}
	public void method1(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void method1(String a)
	{
		System.out.println(a);
	}
}
