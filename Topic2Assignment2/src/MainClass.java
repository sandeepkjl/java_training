
public class MainClass {

	public static void main(String[] args) {
		
		Email email = new Email();
		
		email.setSender("sandeep786@gmail.com");
		email.setRecipient("karan786@gmail.com");
		email.setTitle("meassage");
		email.setText("Hi Good Morning, How are you?");
		
		System.out.println("Email Sender : "+ email.getSender());
		System.out.println("Email Recipients : "+ email.getRecipient());
		System.out.println("Email Title : "+ email.getTitle());
		System.out.println("Email Body : "+ email.getText());
		

	}

}
