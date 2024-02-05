package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraTaskBeauty {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.myntra.com/");
		WebElement beauty = driver.findElement(By.xpath("//a[@data-group='beauty']"));
		Actions a = new Actions(driver);
		a.moveToElement(beauty).perform();
		driver.findElement(By.xpath("//a[text()='Face Moisturiser']")).click();
		
		// TODO Auto-generated method stub

	}

}
