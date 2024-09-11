package Learning_steps;

import java.time.Duration;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignement_2_Solution {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "src/main/java/drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

	driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

	driver.findElement(By.id("password")).sendKeys("learning");

	driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

	 //Thread.sleep(3000);

	 WebDriverWait wait = new WebDriverWait(driver,5);

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

	driver.findElement(By.id("okayBtn")).click();

	WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

	Select dropdown = new Select(options);

	dropdown.selectByValue("consult");

	driver.findElement(By.id("signInBtn")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

	List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

	for(int i =0;i<products.size();i++)

	{

		products.get(i).click();

	}

	driver.findElement(By.partialLinkText("Checkout")).click();
}


}














