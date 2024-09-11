package Learning_steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_Verif {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/drivers/chromedriver1.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		// Another wey to switch to the Other Frame 
		int count = driver.findElements(By.tagName("iframe")).size() ; 
		
		System.out.println(count);
		driver.switchTo().frame(0);
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=\"demo-frame\"]")));
		driver.findElement(By.id("draggable"));
		Actions a = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement Drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, Drop).build().perform();
		
		
		
		
		
		
	}

}
