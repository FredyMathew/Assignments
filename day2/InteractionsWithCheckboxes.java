package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//Click on Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Click on Notification Checkbox
		driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div[1]")).click();
		
		//Verify that expected message is displayed
		String message = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();	
		if (message.equalsIgnoreCase("Checked")) {
			System.out.println("PASS: " + message);
		}else{
			System.out.println("FAIL: " + message);
		}
		
		//Click on your favorite language (assuming it's related to checkboxes)
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div[@class='ui-chkbox ui-widget']")).click();
		
		//Click on the "Tri-State Checkbox."
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/..//div[@class='ui-chkbox ui-widget']")).click();
		
		//Verify which tri-state option has been chosen.
		String state = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();	
		System.out.println("Tri-state option : " + state);
		
		//Click on the "Toggle Switch."
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//Verify that the expected message is displayed.	
		String msg = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();	
		if (msg.equalsIgnoreCase("Checked")) {
			System.out.println("PASS: " + msg);
		}else{
			System.out.println("FAIL: " + msg);
		}
		
		//Verify if the Checkbox is disabled.
		boolean status = driver.findElement(By.xpath("//span[text()='Disabled']/preceding-sibling::div[1]")).isEnabled();
		if (status == true) {
			System.out.println("FAIL: Button is enabled");
		}else{
			System.out.println("PASS: Button is disabled");
		}
		
		//Select multiple options on the page (details may be needed).
		driver.findElement(By.xpath("//ul[contains(@class,'selectcheckboxmenu-multiple-container')]")).click();
		driver.findElement(By.xpath("//label[text()='London']/preceding-sibling::div/div[2]")).click();
		driver.findElement(By.xpath("//label[text()='Paris']/preceding-sibling::div/div[2]")).click();
		driver.findElement(By.xpath("//label[text()='Rome']/preceding-sibling::div/div[2]")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'selectcheckboxmenu-multiple-container')]")).click();
		
		
		//Perform any additional actions or verifications required
		String options = "";
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'selectcheckboxmenu-multiple-container')]/li"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			options = options + "\n" + list.get(i).getText();
		}
		System.out.println("Select multiple options: " + options);
		
		//Close the browser window
		driver.close();
	}

}
