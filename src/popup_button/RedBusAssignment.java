package popup_button;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusAssignment {

	public static void main(String[] args) {
		ChromeOptions chrom_options = new ChromeOptions();
		chrom_options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/");
		Actions act = new Actions(driver);
		driver.findElement(By.id("src")).sendKeys("Banglore");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bangalore']"))).click();
		act.k
		// TODO Auto-generated method stub

	}

}
                                                                                                                                                                                                                                                                                                                                                                  