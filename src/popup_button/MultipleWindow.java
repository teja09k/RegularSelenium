package popup_button;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String DWS = driver.getWindowHandle();
		System.out.println(DWS);
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
        WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
        Thread.sleep(10000);
        a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
        Set<String> child = driver.getWindowHandles();
        child.remove(DWS);
        for (String str : child) {
        	driver.switchTo().window(str);	
		}
        Thread.sleep(2000);
        //driver.findElement(By.xpath(""))   
        //a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();

	}

}
