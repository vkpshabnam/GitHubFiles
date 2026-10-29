package collections;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new HashSet<Integer>();
		Set<Integer> l=new HashSet<Integer>();
		s.add(8);
		s.add(10);
		s.add(9);
		s.add(5);
		l.add(3);
		l.add(12);
		l.add(13);
		l.add(21);
		System.out.println(s);
		System.out.println(l);
		s.addAll(l);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(l.isEmpty());
		System.out.println(s.contains(5));
		System.out.println(s.containsAll(l));
		s.remove(5);
		System.out.println(s);
		s.removeAll(l);
		System.out.println(s);
		l.clear();
		System.out.println(l);	
	}

}
