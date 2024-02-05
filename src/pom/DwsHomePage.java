package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsHomePage {

	public DwsHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="small-searchterms")
	WebElement searchfield;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchbutton;
	
	public void searchfield(String value) {
		searchfield.sendKeys(value);
	}
	public void searchbutton() {
		searchbutton.click();
	}
}
