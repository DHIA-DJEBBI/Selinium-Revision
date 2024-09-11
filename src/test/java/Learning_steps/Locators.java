package Learning_steps;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver_2.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys("dhia");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("dhia");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[2]")).sendKeys("dhiadjebbi@hotmail.com");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("53320");

		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]")).click();
		String Password_entire_Text = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/p")).getText();
		String[] Password = Password_entire_Text.split("'");
		String[] Detailed_Text = Password[1].split("'");

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		// String password_Value = Detailed_Text[0];
		driver.findElement(By.name("inputPassword")).sendKeys(Detailed_Text[0]);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkboxTwo\"]")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
		WebElement Expected_Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p"));
		String Expected_Value = Expected_Element.getText();
		assertEquals(Expected_Value, "You are successfully logged in.");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/button")).click();

		Thread.sleep(3000);
		driver.quit();

	}

}
