package week3.day1;

public class PolymorphismMethodOverriding extends PolymorphismMethodOverloading{

	public void reportStep(String msg, String status) {
		System.out.println("Overriding Message: " + msg + ", Overriding Status: " + status);
	}
	
	public void reportStep(int num) {
		System.out.println("No. of methods: " + num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismMethodOverriding obj = new PolymorphismMethodOverriding();
		obj.reportStep("John", "Pass");
		obj.reportStep(1);
	}

}
