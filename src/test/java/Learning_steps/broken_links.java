package Learning_steps;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver_2.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Broken link == broken url ... 
		
		
		
		List<WebElement>  links = driver.findElements(By.cssSelector("li[class=\'gf-li\'] a"));
		// SoftAssert a = new SoftAsserrt();
		
		
		for (WebElement link : links ) {
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			int response = conn.getResponseCode();
			
			if ( response > 400) {
				//Assert.assertTrue(false);
				System.out.println(link.getText());
				
			}	
			
		}
		
		
	}
	
	

}
