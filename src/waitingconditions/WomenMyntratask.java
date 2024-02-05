package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenMyntratask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement women = driver.findElement(By.xpath("//a[@data-group='women']"));
		Actions action = new Actions(driver);
		action.moveToElement(women).perform();
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement dress = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Tops']")));
		dress.click();
		// TODO Auto-generated method stub

	}

}
