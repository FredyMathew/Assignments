package week3.day1;

public class Browser {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	String browserName = "Chrome"; 
	String browserVersion = "Version 121.0.6";
	
	public void openURL() {
		System.out.println("Superclass: Open URL method");
	}
	
	public void closeBrowser() {
		System.out.println("Superclass: Close browser method");
	}
	
	public void navigateBack() {
		System.out.println("Superclass: Navigate back method");
	}
}
