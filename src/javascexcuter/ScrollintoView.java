package javascexcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		driver.get("https://demowebshop.tricentis.com/");
		WebElement laptop14 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true);",laptop14);
		// TODO Auto-generated method stub

	}

}
