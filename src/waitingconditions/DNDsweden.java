package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DNDsweden {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement cap = driver.findElement(By.id("box2"));
		WebElement cont = driver.findElement(By.xpath("//div[text()='Sweden']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(cap, cont).build().perform();
		
		// TODO Auto-generated method stub

	}

}
