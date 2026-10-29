package assignment;

public class StringBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder s=new StringBuilder("hello");
		s.reverse();
		System.out.println(s);
		s.reverse();
		s.append(" world");
		System.out.println(s);
		s.insert(6,"whole ");
		System.out.println(s);
		s.replace(6,12,"entire ");
		System.out.println(s);
		s.delete(6, 13);
		System.out.println(s);
	}

}
