package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookByUtility {
	static WebDriver driver;
	static String given_url="https://www.facebook.com/";
	
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void facebooksignup() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		String current_url= driver.getCurrentUrl();
		String user_data= "pooja12@gmail.com";
		String ph_no = "7030556548";
		Thread.sleep(2000);
		if (given_url.equals(current_url)) {
			System.out.println("your are in facebook page");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			Thread.sleep(2000);
			WebElement Sign_up = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
			Thread.sleep(1000);
			if (Sign_up.isDisplayed()) {
				Thread.sleep(1000);
				System.out.println("Entering into the signup page");
				System.out.println("you are in facebook signup page");
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pooja");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kardile");
				Thread.sleep(2000);
				if (Character.isDigit(user_data.charAt(0))) {
					System.out.println("Signup by mobile no");

					
				}
				else
					System.out.println("Signup by mobile no is unsuccesful");
				
			}
			else
				System.out.println("Check the code");
			
		}
		else
			System.out.println("your are not in facebook page");
		
	}

		// TODO Auto-generated method stub

public static void main(String[] args) throws InterruptedException {
	openBrowser();
	facebooksignup();
	closeBrowser();

}
}
