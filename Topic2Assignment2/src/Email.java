
public class Email extends Document {
	
	private String sender;
	private String  recipient;
	private String title;
	
	
	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Email(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Email [sender=" + sender + ", recipient=" + recipient + ", title=" + title + "]";
	}
	
	
	
	

}
