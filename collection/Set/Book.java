package collection.Set;

public class Book {
	private int price;
	private String title;
	public Book(int p,String t) {
		price=p;
		title=t;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public int hashCode() {
		return price/100;
	}
	
	@Override
	public boolean equals(Object arg) {
		if(!(arg instanceof Book))
			return false;
		Book b=(Book)arg;
		return title.equals(b.title) && price==b.price;
	}
	
	@Override
	public String toString() {
		return "[Title: "+title+", Price: "+price+"]";
	}
}
