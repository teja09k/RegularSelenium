package select;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11Task {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chrom_options = new ChromeOptions();
		chrom_options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://www.dream11.com/");
		//by String name
		//driver.switchTo().frame("send-sms-iframe");
		// by webelement method
		WebElement iframe = driver.findElement(By.className("send_sms_box_inner"));
		driver.switchTo().frame(iframe);
		//Thread.sleep(2000);
		driver.findElement(By.id("regEmail")).sendKeys("7030551111");
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hamburger']")));
		driver.findElement(By.xpath("//div[@id='hamburger']")).clear();
		// TODO Auto-generated method stub

	}

}
