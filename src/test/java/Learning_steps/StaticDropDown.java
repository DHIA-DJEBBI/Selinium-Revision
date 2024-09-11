package Learning_steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		// WebElement staticDropdown = driver.findElement(By.id(null))
		// Select dropdown = new Select();
		driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]"))
				.click();

		Thread.sleep(2000L);

		/*
		 * int i=1;
		 * 
		 * while(i<5)
		 * 
		 * {
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * i++;
		 * 
		 * }
		 */

		System.out.println(driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]"))
				.getText());

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.xpath(
					"//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]"))
					.click();

		}
		driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input"))
				.sendKeys("Agra");

		driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();

		assertEquals(driver
				.findElement(By
						.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]"))
				.getText(), "5 Adult");

		driver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")).click();

		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
