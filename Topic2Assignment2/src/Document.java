
public class Document {
	
	private String text;

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Document [text=" + text + "]";
	}
	
	

}
