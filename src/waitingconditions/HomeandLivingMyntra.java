package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeandLivingMyntra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.myntra.com/");
		WebElement home_living = driver.findElement(By.xpath("//a[@data-group='home-&-living']"));
		Actions action = new Actions(driver);
		action.moveToElement(home_living).perform();
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
		//Object products = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Wall Décor']")));
		driver.findElement(By.xpath("//a[text()='Wall Décor']")).click();
		// TODO Auto-generated method stub

	}

}
