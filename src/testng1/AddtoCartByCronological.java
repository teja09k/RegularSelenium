package testng1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddtoCartByCronological {
	public WebDriver driver;
	@BeforeClass
	public void openTheBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	 @BeforeMethod(enabled = true)
	public void login() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        driver.findElement(By.id("Email")).sendKeys("");
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}
	 @Test
	 public void addtocart() {
		 System.out.println("successfull.....");
		 driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		 
	 }

	
}
