package week3.day2;

//2-abstract class
public abstract class CanaraBank implements Payments {
	
	public void recordPaymentDetails() {
		System.out.println("Payment made from CanaraBank");
	}

	public void cashOnDelivery() {
		System.out.println("Payment by Cash");
	}

	public void upiPayments() {
		System.out.println("Payment made from GPay");
	}
}
