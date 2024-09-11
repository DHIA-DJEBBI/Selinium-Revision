package Learning_steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignement_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		// <input type="text" name="username" id="username" class="form-control">
		
		driver.findElement(By.cssSelector("input[type=\"text\"][name=\"username\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("learning");
		
		// <span class="checkmark"></span> 
		driver.findElement(By.cssSelector("span[class=\"checkmark\"]")).click();
		
		WebElement Dropdown = driver.findElement((By.xpath("//*[@id=\"login-form\"]/div[5]/select")));
		
		Dropdown.click();

		Select list_Select = new Select(Dropdown);

		list_Select.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("signInBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,5	);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"navbarResponsive\"]/ul/li/a")));

		
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		// int i ;  
		
		for( int i=0 ; i<products.size()  ;i++) {
			
			products.get(i).click() ; 
			
		}
		
		
		
		

	}

}
