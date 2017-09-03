package collection.Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* Output-
 * 		
 *  Java
	C
	JavaScript
	Python
 *  
 * */
public class HashSetExample {

	public static void main(String[] args) {
		Set<String> list= new HashSet<>();
		list.add("Java");
		list.add("Python");
		list.add("C");
		list.add("JavaScript");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Removed Element: "+list.remove("C"));
		System.out.println(list.parallelStream());
	}
}
