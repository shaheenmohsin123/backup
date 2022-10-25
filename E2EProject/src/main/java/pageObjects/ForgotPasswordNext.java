package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordNext {
    
	public WebDriver driver;
	public ForgotPasswordNext(WebDriver driver) {
	 this.driver=driver;
	}

	By email= By.cssSelector("[id='user_email']");
	By sendMeInstructions= By.cssSelector("[type='submit']");
	
	public WebElement getEmail()
	{
	 return	driver.findElement(email);
	}
	
	public WebElement SendInstructions()
	{
	 return	driver.findElement(sendMeInstructions);
	}
}
