package week1.day2;

public class Browser {

	public String launchBrowser(String browserName) {
		return browserName;
	}

	public void loadUrl(){
		System.out.println("Browser launched successfully");
	}

	public static void main(String[] args) {
		Browser obj = new Browser();
		
		String printBrowserName = obj.launchBrowser("GoogleChrome");
		System.out.println(printBrowserName);
		
		obj.loadUrl();
	}
}
