package assignment;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s=new StringBuffer("hello");
		s.reverse();
		System.out.println(s);
		s.reverse();
		s.append(" world");
		System.out.println(s);
		s.insert(5," whole");
		System.out.println(s);
		s.delete(6, 12);
		System.out.println(s);
		s.replace(6, 6, "entire ");
		System.out.println(s);
	}

}
