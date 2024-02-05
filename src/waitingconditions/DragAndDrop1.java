package waitingconditions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement capital = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement country = driver.findElement(By.xpath("//div[text()='Norway']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(capital, country).build().perform();
		// TODO Auto-generated method stub

	}

}
