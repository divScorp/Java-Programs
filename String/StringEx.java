package String;

public class StringEx {
	public static void main(String[] args) {
		String given = "a4b2c2a3f1g2";
		String[] strArray = given.split("");
		String result = "";
		System.out.println(given.length());

		for (int i = 0; i < strArray.length; i += 2) {
			int limit = Integer.parseInt(strArray[i + 1]);
			System.out.println("limit: " + limit);
			for (int j = 0; j < limit; j++) {
				result += strArray[i];
			}
		}
		System.out.println("Final String: " + result);
	}
}
