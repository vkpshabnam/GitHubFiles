package collections;

import java.util.LinkedList;
import java.util.List;

public class ListNonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l= new LinkedList();
		l.add(8);
		l.add(5);
		l.add(0);
		l.add("Hello");
		l.add('a');
		l.add(15);
		l.add(0);
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(2,10);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.remove(2);
		System.out.println(l);
		System.out.println(l.contains('a'));
		System.out.println(l.indexOf(5));
		System.out.println(l.lastIndexOf(0));
		
	}

}
