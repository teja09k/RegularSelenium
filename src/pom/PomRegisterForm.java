package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomRegisterForm {
	public PomRegisterForm(WebDriver driver) {
		 PageFactory.initElements(driver,this);
		 
	}
	
	@FindBy(linkText="Register")
	WebElement registerb;
	
	@FindBy(id="gender-female")
	WebElement gender;
	
	@FindBy(name="FirstName")
	WebElement name;
	
	@FindBy(name="LastName")
	WebElement lastname;
	
	@FindBy(name="Email")
	WebElement mail;
	
	@FindBy (id="Password")
	WebElement pass;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirm;
	
	@FindBy(name="register-button")
	WebElement registerbuttton;
}
