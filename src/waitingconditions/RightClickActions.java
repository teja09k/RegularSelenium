package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions action = new Actions(driver);
		action.contextClick(right_click).build().perform();
		WebElement delete1 = driver.findElement(By.xpath("//span[text()='Delete']"));
		delete1.click();
		try {delete1.isEnabled();
		    System.out.println("delete option not clicable");
			
		} catch (Exception e) {
		    System.out.println("My script is successful");

			
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}

}
