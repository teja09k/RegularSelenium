package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		//String given_url="https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='dropbtn']")));
		dropdown.click();
		WebElement facebook_page = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Facebook')]")));
		facebook_page.click();
		Thread.sleep(2000);
		WebElement fb_signup = driver.findElement(By.xpath("https://www.facebook.com/"));
		if (fb_signup.isDisplayed()) {
			System.out.println("Entering into the facebook page");	
		}
		else
			System.out.println("check the code");
			
		driver.close();
		// TODO Auto-generated method stub

	}

}
