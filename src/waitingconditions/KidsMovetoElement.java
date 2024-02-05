package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KidsMovetoElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement kids = driver.findElement(By.xpath("//a[@data-group='kids']"));
		Actions a= new Actions(driver);
		a.moveToElement(kids).perform();
		driver.findElement(By.xpath("//a[text()='Bodysuits']")).click();
		// TODO Auto-generated method stub

	}

}
