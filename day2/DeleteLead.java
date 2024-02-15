package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Login to application
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click Find leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click Phone 
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		//Capture the lead ID of the first resulting lead
		WebElement id = driver.findElement(By.xpath("(//td/div/a[@class='linktext'])[1]"));
		String firstId = id.getText();
		System.out.println("ID of the first item: " + firstId);
		
		//Select first link from the table
		id.click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click find leads and search deleted id
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify if deleted record is removed successfully
		String records = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		if (records.contains("No records")) {
			System.out.println("Deleted Lead Successfully");
		}else{
			System.out.println("Deletion Failed");
		}
		
		//Close browser
		driver.close();
	}

}
