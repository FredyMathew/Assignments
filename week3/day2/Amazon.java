package week3.day2;

//3-concrete class
public class Amazon extends CanaraBank {

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payment made by card-direct implement method");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Payment made online-direct implement method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amazon obj = new Amazon();
		obj.recordPaymentDetails();
		obj.cashOnDelivery();
		obj.upiPayments();
		obj.cardPayments();
		obj.internetBanking();
	}	

}
