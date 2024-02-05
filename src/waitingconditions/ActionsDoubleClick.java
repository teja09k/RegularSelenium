package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement double_click = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions action = new Actions(driver);
		action.doubleClick(double_click).perform();
		Thread.sleep(2000);
		try {
			double_click.isEnabled();
			System.out.println("my scipt is unsuccessfull");
			
		} catch (Exception e) {
			System.out.println("my scipt is successfull");

		}
		// TODO Auto-generated method stub
        
	}

}
