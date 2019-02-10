import java.time.LocalDate;

public class CreditCardPayment extends Payment {
	
	private String cardHolderName;
	private LocalDate expiryDate;
	private String cardNumber;
	
	
	public CreditCardPayment() {
		super();
	}
	public CreditCardPayment(double amount) {
		super(amount);
		
	}
	public CreditCardPayment(double amount, String cardHolderName, LocalDate expiryDate, String cardNumber) {
		super(amount);
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.cardNumber = cardNumber;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@Override
	public String toString() {
		return "CreditCardPayment [cardHolderName=" + cardHolderName + ", expiryDate=" + expiryDate + ", cardNumber="
				+ cardNumber + ", Amount=" + getAmount() + "]";
	}
	@Override
	public void paymentDeatils() {
		System.out.println("CreditCardPayment [cardHolderName=" + cardHolderName + ", expiryDate=" + expiryDate + ", cardNumber="
				+ cardNumber + ", Amount=" + getAmount() + "]");
		
	}
	
	
	
	
	
}
