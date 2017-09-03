package collection.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> list= new Vector<>();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("HTML");
		System.out.println("Element at index 2: "+list.get(2));
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Removed Element: "+list.remove(2));
		System.out.println("New Element at index 2: "+list.get(2));
		System.out.println(list.parallelStream());
		System.out.println(list.iterator());
		list.set(2,"JavaScript");
		System.out.println("Postion 2 Element Changed to "+list.get(2));
	}
}
