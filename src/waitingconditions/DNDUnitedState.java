package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DNDUnitedState {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement Capital = driver.findElement(By.id("box3"));
		WebElement Country = driver.findElement(By.id("box103"));
		Actions us= new Actions(driver);
		us.dragAndDrop(Capital, Country).build().perform();
		// TODO Auto-generated method stub

	}

}
