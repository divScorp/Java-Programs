package collection.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/* 
		C
		JavaScript
		Java
		Python
*/

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<String> list= new PriorityQueue<>();
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
