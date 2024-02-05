package popup_button;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriFileUpload {
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("register_Layer")).click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\tejas\\Documents\\Custom Office Templates\\Resume\\pooja.pdf");
		Thread.sleep(4000);
		driver.quit();

		
		// TODO Auto-generated method stub

	}

}
