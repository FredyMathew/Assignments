package week3.day1;

public class Chrome extends Edge {

	public void openIncognito() {
		System.out.println("Childclass Chrome: openIncognito method");
	}
	
	public void clearCache() {
		System.out.println("Childclass Chrome: clearCache method");
	}
	
	public static void main(String[] args) {
		Chrome obj = new Chrome();
		
		System.out.println(obj.browserName);
		System.out.println(obj.browserVersion);
		obj.openURL();
		obj.closeBrowser();
		obj.navigateBack();
		obj.readerMode();
		obj.fullScreenMode();
		obj.takeSnap();
		obj.clearCookies();
		obj.openIncognito();
		obj.clearCache();
	}
}
