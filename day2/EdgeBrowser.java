package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser obj1 = new Browser();
		
		String printNewBrowserName = obj1.launchBrowser("Edge");
		System.out.println(printNewBrowserName);
		
		obj1.loadUrl();
	}

}
