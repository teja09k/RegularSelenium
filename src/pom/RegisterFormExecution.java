package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterFormExecution {
	@Test
	public void form() {
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		  driver.get("https://demowebshop.tricentis.com/wishlist");
		  PomRegisterForm execute =new PomRegisterForm(driver);
		  execute.registerb.click();
		  execute.gender.click();
		  execute.name.sendKeys("Pooja");
		  execute.lastname.sendKeys("Kardile");
		  execute.mail.sendKeys("pooja12@gmail.com");
		  execute.pass.sendKeys("pooja1212");
		  execute.confirm.sendKeys("pooja1212");
		  execute.registerbuttton.click();
		  
	}

}
