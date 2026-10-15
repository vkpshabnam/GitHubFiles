package access_mod;

public class PrivateMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateMod p = new PrivateMod();
		p.method1();
	}
	private void method1()
	{
		System.out.println("This is a private method");
	}
}
