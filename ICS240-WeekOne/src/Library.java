import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public Library() {
		
	}
	
	public void add(Book b1) {
		books.add(b1);
	}
	
	public void remove(Book b1) {
		books.remove(b1);
	}
	
	public void print() {
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).getTitle());
		}
	}
	
	public void printAtIndex(int index) {
		System.out.println(books.get(index));
	}
}
