package Learning_steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Assignement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=\"frame-top\"]")));
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name=\"frameset-middle\"]")));
		
		String value_of_middleFrame = driver.findElement(By.id("id=\"content\"")).getText();
		System.out.println(value_of_middleFrame);
		
		
		
		
		

	}

}
