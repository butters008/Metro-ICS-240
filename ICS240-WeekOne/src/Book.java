
public class Book {
	//declare variables
	private String title;
	private int publish;
	private String[] pages = new String[5000];
	
	public Book() {
		
	}
	
	public Book(String title, int publish, String[] pages) {
		this.title = title;
		this.publish = publish;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublish() {
		return publish;
	}

	public void setPublish(int publish) {
		this.publish = publish;
	}

	public String[] getPages() {
		return pages;
	}

	public void setPages(String[] pages) {
		this.pages = pages;
	}
	
	public String toString() {
		return "Title: " + title + "\nPublished: " + publish + "\n";
	}

}
