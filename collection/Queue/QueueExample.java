package collection.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
/*    Java
	  Python
	  C
	  JavaScript
 */
public class QueueExample {

	public static void main(String[] args) {
		Queue<String> list= new ArrayDeque<>();
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
