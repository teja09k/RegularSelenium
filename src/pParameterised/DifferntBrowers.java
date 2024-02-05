package pParameterised;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferntBrowers {
	WebDriver driver;
	@Parameters("Driver")
	@Test
	public void browsers(String div) {
		if(div.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("hi I am from ChromDriver");
			Reporter.log("chromdriver");

			}
		else if (div.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			System.out.println("hi I am from edgedriver");
			Reporter.log("edgedriver");
		}
		else if (div.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			System.out.println("hi I am from firefoxdriver");
			Reporter.log("firefoxdriver");
			
		}
		else
			System.out.println("you are not in driver");
		
		
	}

}
