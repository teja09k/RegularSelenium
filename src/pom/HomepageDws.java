package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageDws {
	public HomepageDws(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	@FindBy([alt="Tricentis Demo Web Shop"])
	WebElement title;
	
	@FindBy(linkText="Register")
	WebElement register;
	
	@FindBy(class="ico-login")
	WebElement login;
	
	@FindBy()
		

}
