package collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinekedHAshMapExample {

	public static void main(String[] args) {
		Map<String,Integer> m=new LinkedHashMap<>();
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
