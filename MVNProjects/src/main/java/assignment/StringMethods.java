package assignment;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String s1="This is the FIRST string";
	String s2="This is the first string";
	int x=10;
	
	
	System.out.println(s1.length());
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.toLowerCase());
	System.out.println(s2.toUpperCase());
	System.out.println(s1.startsWith("The"));
	System.out.println(s2.endsWith("string"));
	System.out.println(s1.charAt(3));
	System.out.println(String.valueOf(x));
	
	}

}
