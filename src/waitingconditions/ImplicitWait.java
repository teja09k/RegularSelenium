package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into facebook
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Riyansh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kardile");
	    WebElement sign_up = driver.findElement(By.xpath("//img[@class='_8idr img']"));
	    if (sign_up.isDisplayed()) {
	    	System.out.println("You are in signup page");
			
		}
	    else
	    	System.out.println("You are not in signup page");

		



	}

}
