package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		
		//Enter inputs in form
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Hexaware");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Fredy");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mathew");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("UAT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test team lead");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@gmail.com");
		
		//Select state from drop-down	
		WebElement state = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select option = new Select(state);
		option.selectByVisibleText("New York");
		
		//click on Create lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//click on Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//clear Description field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Update Important note field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated the description");
				
		//click on Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get the title text
		String title = driver.getTitle();	
		System.out.println("Title of the Resulting Page: " + title);
		
		//Close browser
		driver.close();
	}

}
