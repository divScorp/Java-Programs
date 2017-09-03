package collection.List;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(8);
		list.add(17);
		list.add(14);
		Integer[] arr=list.toArray(new Integer[0]);
		for(Integer a:arr) {
			System.out.println(a.toString());
		}

	}

}
