package popup_button;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertActionTask {

	public static void main(String[] args) throws InterruptedException {
		//enter into browser
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into browser
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
//		Actions action = new Actions(driver);
//		action.moveToElement(right_click).contextClick(right_click).build().perform();
//		driver.findElement(By.xpath("//span[text()='Edit']")).click();
//		Alert al = driver.switchTo().alert();
//		al.accept();
		List<WebElement> Content_insidebox = driver.findElements(By.xpath("class=\"context-menu-item context-menu-icon context-menu-icon-edit context-menu-visible\""));
		for (WebElement web : Content_insidebox) {
			System.out.println(web.getText());
			Thread.sleep(2000);
			Actions a = new Actions(driver);
			a.moveToElement(right_click).contextClick(right_click).build().perform();
			Thread.sleep(2000);
			web.click();
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			Thread.sleep(2000);
			System.out.println(al.getText());
			Thread.sleep(2000);
			al.dismiss();
			driver.close();
			
			
		}
		// TODO Auto-generated method stub

	}

}
