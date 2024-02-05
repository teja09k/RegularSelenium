package popup_button;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupByRobot {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		

		// TODO Auto-generated method stub

	}

}
