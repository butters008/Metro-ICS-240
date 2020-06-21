
public class Driver {

	public static void main(String[] args) {
		Library library = new Library();
		String[] pages = new String[30];
		pages[0] = "title";
		pages[1] = "introduction";
		
		Book b1 = new Book ("Book 1", 1990, pages);
		Book b2 = new Book ("Book 2", 1995, pages);
		Book b3 = new Book ("Book 3", 2005, pages);
		
		library.add(b1);
		library.add(b2);
		library.add(b3);
		
		library.print();
		System.out.println("");
		library.printAtIndex(0);
		
		library.remove(b1);
		library.print();
		

	}

}
