package access_mod;

import accessModifier.AccessModifier;

public class AccessMod extends ProtectedMod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier x=new AccessModifier();
		x.method();
		AccessMod p=new AccessMod();
		p.method1();
	}
}
