package book;

public class MainClass {
	
	public static void main(String args[])
	{
		Book book = new Book("978-3-16-148410-0", "Java: The Complete Reference", 
				"Herbert Schildt", 619.0);
		
		book.dispalyDetails();
		book.getDiscountPrice(book.getPrice(), 10);
	}

}
