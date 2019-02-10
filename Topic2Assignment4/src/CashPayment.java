
public class CashPayment extends Payment{

	public CashPayment() {
		super();
		
	}

	public CashPayment(double amount) {
		super(amount);
		
	}

	@Override
	public void paymentDeatils() {
		System.out.println("Payement has been done in Cash");
		super.paymentDeatils();
	}
	
	

}
