package collections;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		Iterator<Integer> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(l);
		
		
	}

}
