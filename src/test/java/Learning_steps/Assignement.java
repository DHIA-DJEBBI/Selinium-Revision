package Learning_steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		Thread.sleep(4000);
		

		driver.findElement(By.cssSelector("input.form-control[name=\"name\"][required]")).sendKeys("Dhia");

		// <input class="form-control ng-untouched ng-pristine ng-invalid" name="email"
		// required="" type="text">

		driver.findElement(By.cssSelector("input.form-control[name=\"email\"][required][type=\"text\"]"))
				.sendKeys("dhiadjebbi1@gmail.com");

		// <input class="form-control" id="exampleInputPassword1" placeholder="Password"
		// type="password">

		driver.findElement(By.cssSelector("input.form-control[id=\"exampleInputPassword1\"][placeholder=\"Password\"]"))
				.sendKeys("AZERTY");

		driver.findElement(By.xpath("//*[@id=\"exampleCheck1\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[1]")).click();

		WebElement Dropdown = driver.findElement((By.id("exampleFormContolSelect1")));

		Select abc = new Select(Dropdown);

		abc.selectByVisibleText("Male");

		driver.findElement(By.xpath("//*[@id=\"inlineRadio2\"]")).click();

		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/input")).sendKeys("20/08/1999");

		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/input")).click();

		Assert.assertTrue(true);

	}

}
