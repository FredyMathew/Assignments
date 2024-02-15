package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();	
		
		//Select 'Your most favourite browser' from the radio buttons
		driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div)[1]")).click();
		
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’
		WebElement chennai = driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div"));
		chennai.click();		
		chennai.click();
		boolean status1 = chennai.isSelected();
		if (status1 == true) {
			System.out.println("FAIL: Option selected");
		}else{
			System.out.println("PASS: Option deselected");
		}
		
		
		//Identify the radio button that is initially selected by default.
		List<WebElement> list = driver.findElements(By.xpath("//h5[text()='Find the default select radio button']/..//div[@class='grid formgrid']//div[contains(@class,'ui-state-default')]"));
		List<WebElement> opn = driver.findElements(By.xpath("//h5[text()='Find the default select radio button']/..//div[@class='grid formgrid']//div[contains(@class,'ui-state-default')]/../..//label"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String options = list.get(i).getAttribute("class");
			String opnName = opn.get(i).getText();
			if(options.contains("active")) {
				System.out.println("Default selected option: " + opnName);
			}
		}
		
		//Check and select the age group (21-40 Years) if not already selected.
		List<WebElement> agelist = driver.findElements(By.xpath("//h5[text()='Select the age group (only if not selected)']/..//div[@class='grid formgrid']//div[contains(@class,'ui-state-default')]"));
		List<WebElement> ageOptions = driver.findElements(By.xpath("//h5[text()='Select the age group (only if not selected)']/..//div[@class='grid formgrid']//div[contains(@class,'ui-state-default')]/../..//label"));
		int icount = agelist.size();
		for (int j = 0; j < icount; j++) {
			String option = agelist.get(j).getAttribute("class");
			String ageName = ageOptions.get(j).getText();
			if(ageName.contains("21-40 Years")){
				if(option.contains("active")){
				System.out.println("Default selected option: " + ageName);
				}else {
					agelist.get(j).click();
					System.out.println("Selected option manually: " + ageName);
				}
			}
		}
		//Close the browser window
		driver.close();
	}

}
