package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitOmayo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		WebElement facebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
		facebook.click();
		WebElement fb_page = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if (fb_page.isDisplayed()) {
			System.out.println("your in the facebook page");
			
			
		}
		else
			System.out.println("your not in the facebook page");
		
		// TODO Auto-generated method stub

	}

}
