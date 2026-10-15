package encapsulation;

public class encapsClass {
	
	private int a;
	private int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsClass e=new encapsClass();
		e.setValue(4, 5);
		e.getValue();

	}
	public void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void getValue()
	{
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}

}
