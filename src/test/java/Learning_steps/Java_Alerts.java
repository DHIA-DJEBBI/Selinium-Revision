package Learning_steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Java_Alerts {

	public static void main(String[] args) throws InterruptedException {

		String text = "Dhia";

		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.findElement(By.id("name")).sendKeys(text);
		// driver.findElement(By.id("alertbtn")).click();

		// <input id="alertbtn" class="btn-style" value="Alert" onclick="displayAlert()"
		// type="submit">

		driver.findElement(By.cssSelector("input[id=\"alertbtn\"][class=\"btn-style\"]")).click();

		// Manage Alerts
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		driver.findElement(By.id("confirmbtn")).click();
		// For dismissing an Alert...
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}












