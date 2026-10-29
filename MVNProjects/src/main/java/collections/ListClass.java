package collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l= new ArrayList<Integer>();
		l.add(8);
		l.add(5);
		l.add(0);
		
		l.add(4);
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(2,10);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.remove(3);
		l.add(5);
		System.out.println(l);
		System.out.println(l.contains(9));
		System.out.println(l.contains(10));
		System.out.println(l.indexOf(5));
		System.out.println(l.lastIndexOf(5));
	}

}
