package collection.List;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		String[] strs = {"JAVA", "Python", "GoLang","PHP"};
	      System.out.println(Arrays.toString(strs));   
	 
	      List<String> list = Arrays.asList(strs);
	      System.out.println(list);
	      
	      List<Integer> IntList = Arrays.asList(22, 44, 11, 33);
	      System.out.println(IntList);
	}

}
