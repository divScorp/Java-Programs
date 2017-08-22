package ObjectOrdering;
import java.util.Arrays;

class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	public Movie(String n, double rt, int y) {
		this.name = n;
		this.rating = rt;
		this.year = y;
	}
	// compare on the basis of rating
	/*
	 * public int compareTo(Movie arg) { return this.year - arg.year; }
	 */

	// compare on the basis of name
	public int compareTo(Movie m) {
		return this.name.compareTo(m.name); // this will call compareTo method of String Class
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}

public class ComparableMovie {

	public static void main(String[] args) {
		Movie[] mov=new Movie[4]; 
		mov[0]=new Movie("Inception",8.9,2010); 
		mov[1]=new Movie("The Dark Knight",9.0,2008); 
		mov[2]=new Movie("Intersteller",8.7,2014);
		mov[3]=new Movie("The Prestige",8.2,2005); 
		Arrays.sort(mov);
		System.out.println("Movie list in sorted order: ");
		for (Movie mv : mov) {
			System.out.println(
					"Name: " + mv.getName() + "\t\t[Rating: " + mv.getRating() + "\tYear: " + mv.getYear() + "]");
		}
	}
}
