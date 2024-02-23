package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones" + Keys.ENTER);

		
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		
		
		List<Integer> priceList = new ArrayList<Integer>();
		for (WebElement i : price) {
			String priceText = i.getText();
			String roundPrice = priceText.replaceAll(",", "");
			int priceInt = Integer.parseInt(roundPrice);
			priceList.add(priceInt);
		}
		
		Collections.sort(priceList);
		System.out.println("All price list: " + priceList);
		System.out.println("Minimum/First item price from the list: " + priceList.get(0));
		
		

//		List<String> names = new ArrayList<String>();
//		
//		names.add("Fredy");
//		names.add("Mathew");
//		names.add("John");
//		names.add("Karthik");
//		names.add("Sivaji");
//		names.add("John");
//		System.out.println(names);
//		
//		//to remove
//		names.remove(1);
//		
//		//to add
//		names.add(1, "Kavi");
//		System.out.println(names);
//		
//		//to get particular list value
//		String name = names.get(1);
//		System.out.println(name);
	}

}
