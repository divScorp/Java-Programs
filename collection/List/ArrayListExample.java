package collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(8);
		list.add(17);
		list.add(14);
		System.out.println("Element at index 2: "+list.get(2));
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("Removed Element: "+list.remove(2));
		System.out.println("New Element at index 2: "+list.get(2));
		System.out.println(list.parallelStream());
		System.out.println(list.iterator());
		list.set(2,15);
		System.out.println("Postion 2 Element Changed to "+list.get(2));
	}

}
