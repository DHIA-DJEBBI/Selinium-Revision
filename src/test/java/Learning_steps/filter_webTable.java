package Learning_steps;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filter_webTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver_2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		Thread.sleep(40000);
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filtered_List = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(),filtered_List.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
