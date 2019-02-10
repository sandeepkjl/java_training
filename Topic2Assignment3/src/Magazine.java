
public class Magazine extends Book {
	
	private String type;

	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Magazine(String isbn, String title, String price, String type) {
		super(isbn, title, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Magazine [type=" + type + ", Isbn()=" + getIsbn() + ", Title()=" + getTitle() + ", Price()="
				+ getPrice() 
				 + "]";
	}
	
	

}
