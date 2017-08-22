package generics;

public class GenericMethod {

	public static <E> void printArray(E[] array) {
		for (E ele : array) {
			System.out.print(ele + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] i = { 3, 5, 11, 7, 2 };
		Double[] d = { 1.1, 2.3, 4.7, 2.5 };
		Character[] ch = { 'H', 'E', 'L', 'L', 'O' };
		// int[] in= {1,2,3,4};
		// printArray(in); //CTE : only Non-primitive type data will be generic

		System.out.println("Integer Array Element: ");
		printArray(i);
		System.out.println("Double Array Element: ");
		printArray(d);
		System.out.println("Character Array Element: ");
		printArray(ch);
	}
}
