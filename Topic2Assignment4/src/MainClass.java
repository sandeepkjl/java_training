import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) {
		CashPayment cashPayment1 = new CashPayment(50000.00);
		CashPayment cashPayment2 = new CashPayment(70000.00);
		
		CreditCardPayment creditCardPayment1 = new CreditCardPayment(56352.00, "karan", LocalDate.now(), "5658 8552 5555 0055");

		CreditCardPayment creditCardPayment2 = new CreditCardPayment(98652.00, "Rohan", LocalDate.now(), "9688 8855 7896 6655");
		
		
		cashPayment1.paymentDeatils();
		cashPayment2.paymentDeatils();
		creditCardPayment1.paymentDeatils();
		creditCardPayment2.paymentDeatils();
		
	
	}

}
