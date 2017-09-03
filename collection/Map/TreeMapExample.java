package collection.Map;

import java.util.Map;
import java.util.TreeMap;
/*
			Value Associated with key 'two'= 2
			Keysets: [one, seven, six, two]
			Entry of map: [one=1, seven=7, six=6, two=2]
			Size of map: 4
			one : 1
			{one=1, seven=7, six=6, two=2}
*/
public class TreeMapExample {
	public static void main(String[] args) {
		Map<String,Integer> m=new TreeMap<>();
		//Treemap sorts according to key  
		m.put("six", 6);
		m.put("one", 1);
		m.put("two", 2);
		m.put("seven", 7);
		System.out.print("Value Associated with key 'two'= "+m.get("two")+"\n");
		System.out.print("Keysets: "+m.keySet()+"\n");
		System.out.print("Entry of map: "+m.entrySet()+"\n");
		System.out.println("Size of map: "+m.size());
		if(m.containsKey("one")) {
			Integer x=m.get("one");
			System.out.println("one : "+x);
		}
		if(!m.isEmpty())
			System.out.println(m);
	}
}
