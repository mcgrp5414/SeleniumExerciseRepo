package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userid;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwrd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public void setUsername() 
	{
	    userid.sendKeys("Admin");
	}
	
	public void setPassword() {
		passwrd.clear();
		passwrd.sendKeys("admin123");
	}
	
	
	public void clicksubmit() {
		submit.click();
	}
	
	
	
	

}
