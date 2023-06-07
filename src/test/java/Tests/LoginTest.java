package Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class LoginTest {
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	
	@BeforeTest
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Chromedrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginmethod() 
	{
	  lp = new LoginPage(driver);
	  lp.setUsername();
	  lp.setPassword();
	  lp.clicksubmit();
	  
	  hp= new HomePage(driver);
	  String Actual= hp.title();
	  String Expected = "OrangeHRM";
	  
	  Assert.assertEquals(Actual, Expected);
	  
	}
	
	@AfterTest
	public void teardown() 
	{
		driver.close();
	}

}
