package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		Thread.sleep(5000);
		
		String title = driver.getTitle();	
		if (title.contains("TestLeaf")) {
			System.out.println("Login Successful");
		}else{
			System.out.println("Login Failed");
		}
		

//			 
//			//div[@class='cartInner']/span[text()='Cart']
//			 
//			 Parent to Child
//			//div[@class='cartInner']/span
//			 
//			 GrandParent to GrandChild
//			//div[contains(@class,'reset-padding')]//span[text()='Cart']
//			 
//			//span[@class='brandValueFooter']//a[text='Footwear:']
			 
			 
	}

}
