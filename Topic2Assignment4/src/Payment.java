
public class Payment {
	
	private double amount;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Payment [amount=" + amount + "]";
	}
	
	public void paymentDeatils()
	{
		System.out.println("Amount of the Payment : "+ amount);
	}

}
