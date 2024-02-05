package waitingconditions;
import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions action = new Actions(driver);
		action.moveToElement(men).perform();
		driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
		// TODO Auto-generated method stub

	}

}
