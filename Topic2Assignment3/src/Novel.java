
public class Novel extends Book {
	
	private String author;

	public Novel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Novel(String isbn, String title, String price) {
		super(isbn, title, price);
		// TODO Auto-generated constructor stub
	}

	public Novel(String isbn, String title, String price, String author) {
		super(isbn, title, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Novel [author=" + author + ", Isbn()=" + getIsbn() + ", Title()=" + getTitle() + ", Price()="
				+ getPrice()
				+ "]";
	}

	
	
	
}
