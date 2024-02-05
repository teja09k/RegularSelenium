package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteDWSpage {
	@Test
	public void reciever() {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		DwsHomePage execute = new DwsHomePage(driver);
		//execute.searchfield.sendKeys("pooja");
		//execute.searchbutton.click();
		execute.searchfield("Pooja");
		execute.searchbutton.click();
		
	}

}
