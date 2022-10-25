package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	private By email =By.id("user_email");
	private By password= By.cssSelector("[type='password']");
	private By log = By.cssSelector("[value='Log In']");
	private By forgotpassword= By.cssSelector("[href*='password/new']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver= driver;
	}

	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getLogin()
	{
		return driver.findElement(log);
	}
	
	public ForgotPasswordNext ForgotPassword()
	{
		driver.findElement(forgotpassword).click();
		ForgotPasswordNext fp=new ForgotPasswordNext(driver);
		return fp;
	}
}
