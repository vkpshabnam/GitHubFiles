package access_mod;

public class ProtectedMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedMod m=new ProtectedMod();
		m.method1();

	}

	protected void method1()
	{
		System.out.println("This is a protected method");
	}
}
