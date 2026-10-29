package collections;


import java.util.Set;
import java.util.TreeSet;

public class SetNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s= new TreeSet();
		s.add(8);
		s.add(5);
		s.add(0);
		s.add(15);
		System.out.println(s);
		Set l= new TreeSet();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		s.addAll(l);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(l.size());
		System.out.println(s.isEmpty());
		System.out.println(l.isEmpty());
		System.out.println(l.contains(5));
		System.out.println(s.contains(5));
		System.out.println(s.containsAll(l));
		System.out.println(l.containsAll(s));
		s.remove(5);
		System.out.println(s);
		s.removeAll(l);
		System.out.println(s);
		s.clear();
		System.out.println(s);
		for(Object i:l)
		{
			System.out.println(i);
		}
	}

}
