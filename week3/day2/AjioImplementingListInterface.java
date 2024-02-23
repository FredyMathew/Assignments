package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioImplementingListInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		
		//Launch Ajio.com
		driver.get("https://www.ajio.com/");
		
		//Search "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags" + Keys.ENTER);

		//under "Gender" click on "Men"
		driver.findElement(By.xpath("//input[@id='Men']/following-sibling::label[contains(@class,'genderfilter')]")).click();
		Thread.sleep(4000);
		
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label[contains(@class,'Fashion Bags')]")).click();
		
		//Print the count of the items found
		List<WebElement> bags= driver.findElements(By.xpath("//div[@class='brand']/strong"));
		System.out.println("Number of items in the list: " + bags.size());
		
		//Get the list of brand of the products displayed in the page and print the list
		List<String> brandNames = new ArrayList<String>();
		for (WebElement i : bags) {
			String names = i.getText();
			brandNames.add(names);
		}
		System.out.println("All brand names: " + brandNames);

		
		//Get the list of names of the bags and print it
		List<WebElement> names= driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> bagNames = new ArrayList<String>();
		for (WebElement j : names) {
			String bNames = j.getText();
			bagNames.add(bNames);
		}
		System.out.println("All bag names: " + bagNames);
		
		//Close browser
		driver.close();
	}

}
