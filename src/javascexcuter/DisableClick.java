package javascexcuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement download_link = driver.findElement(By.linkText("jdk-11.0.19_windows-x64_bin.zip"));
		js.executeScript("arguments[0].scrollIntoView(false);", download_link);
		download_link.click();
		WebElement disable_button = driver.findElement(By.linkText("Download jdk-11.0.19_windows-x64_bin.zip"));
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disable_button);
		// TODO Auto-generated method stub

	}

}
