import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Actions action = new Actions(driver);
		action.keyDown(Keys.PAGE_DOWN).build().perform();
		action.keyUp(Keys.PAGE_DOWN).build().perform();
		action.keyDown(Keys.PAGE_UP).build().perform();
		action.keyDown(Keys.PAGE_UP).build().perform();
		
		
		// TODO Auto-generated method stub

	}

}
