package book;

public class Book {
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Book(String isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]";
	}
	
	public void dispalyDetails()
	{
		System.out.println("Book [isbn=" + isbn + ", title=" + title + ", author=" + author
				+ ", price=" + price + "]");
	}
	
	public void getDiscountPrice(double price, double discountPercentage)
	{
		double discountPrice= price-(discountPercentage*100/price);
		System.out.println("Price after discount : "+ discountPrice);
	}
	

}
