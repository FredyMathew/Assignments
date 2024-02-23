package week3.day1;

public class PolymorphismMethodOverloading {

	public void reportStep(String msg, String status) {
		System.out.println("Message: " + msg + ", Status: " + status);
	}

	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Message: " + msg + ", Status: " + status + ", Snap: " + snap);
	}

	public void reportStep(int num) {
		System.out.println("No. of methods: " + num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismMethodOverloading obj = new PolymorphismMethodOverloading();
		obj.reportStep("Fredy", "Pass");
		obj.reportStep("Mathew", "Pass", true);
		obj.reportStep(2);
	}
}
