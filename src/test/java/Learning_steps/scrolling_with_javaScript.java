package Learning_steps;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling_with_javaScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> values = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		
		int sum =0;
		
		for(int i=0 ; i< values.size();i++) {
			
			sum= sum + Integer.parseInt( values.get(i).getText());
			
		}
		System.out.println("total of Values is :   "+sum);
		
		// int total = Integer.parseInt(driver.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[2]")).getText().split(":")[1].trim());
		
		
		
		
		
		

	}


}
