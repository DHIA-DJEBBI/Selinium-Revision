package Learning_steps;

import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://qaclickacademy.com/practice.php");
		int count = driver.findElements(By.tagName("a")).size();

		System.out.println(count);

		WebElement footer_driver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer_driver.findElements(By.tagName("a")).size());

		WebElement column_driver = footer_driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));

		System.out.println(column_driver.findElements(By.tagName("a")).size());

		// Click on each Link to check the Functionality of the Link ...
		

		for (int i = 1; i < column_driver.findElements(By.tagName("a")).size() ; i++) {

			String click_Link = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column_driver.findElements(By.tagName("a")).get(i).sendKeys(click_Link);

			Thread.sleep(2000);

			Set<String> abc = driver.getWindowHandles();

			Iterator<String> it = abc.iterator();

			while(it.hasNext())
			{
				it.next();
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}

		}

	}


}
