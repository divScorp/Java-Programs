package collection.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* Output-
		C
		Java
		JavaScript
		Python
*/

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> list= new TreeSet<>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("JavaScript");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Removed Element: "+list.remove("C"));
		
	}

}
