package ObjectOrdering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class MovieCom {
	private double rating;
	private String name;
	private int year;

	public MovieCom(String n, double rt, int y) {
		this.name = n;
		this.rating = rt;
		this.year = y;
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
	public String toString() {
		return "Name: "+name+"\tRating: "+rating+"\tYear: "+year;
	}
}

class RatingCompare implements Comparator<MovieCom> {
	public int compare(MovieCom m1, MovieCom m2) {
		return (m1.getRating() < m2.getRating()) ? -1 : ((m1.getRating() > m2.getRating()) ? 1 : 0);
	}
}

class NameCompare implements Comparator<MovieCom> {
	public int compare(MovieCom m1, MovieCom m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

public class ComparatorMovie {

	public static void main(String[] args) {
		ArrayList<MovieCom> mov = new ArrayList<>();
		mov.add(new MovieCom("Inception  ", 8.9, 2010));
		mov.add(new MovieCom("The Dark Knight", 9.0, 2008));
		mov.add(new MovieCom("Intersteller", 8.7, 2014));
		mov.add(new MovieCom("The Prestige", 8.2, 2005));
		System.out.println("Sorted Movie list on the basis of Name.");
		Collections.sort(mov,new NameCompare());
		for(MovieCom m:mov) 
			System.out.println(m);
		System.out.println("\nSorted Movie list on the basis of Rating.");
		Collections.sort(mov,new RatingCompare());
		for(MovieCom m:mov) 
			System.out.println(m);
	}
}
