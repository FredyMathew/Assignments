package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Click on ‘Click and Confirm title'
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//Verify title of the page
		String title = driver.getTitle();	
		if (title.contains("Dashboard")) {
			System.out.println("Title verification Successful: " + title);
		}else{
			System.out.println("Title verification Failed");
		}
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled
		driver.navigate().back();
		WebElement element = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
		if (element.isEnabled()) {
			System.out.println("Fail:Button is Enabled");
		}else{
			System.out.println("Pass:Button is Disabled");
		}
		
		//Find and print the position of the button with the text ‘Submit.’
		WebElement submit = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[1]"));
		System.out.println("Submit Location: " + submit.getLocation());
	
		//Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement getColor = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
		System.out.println("Save BG Colour: " + getColor.getCssValue("color"));
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		WebElement size = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[2]"));
		System.out.println("Height/width: " + size.getSize());
		
		//Close the browser window
		driver.close();
	}

}
