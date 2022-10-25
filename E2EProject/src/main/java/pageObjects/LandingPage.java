package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	private By signin =By.cssSelector("a[href*='sign_in']");
	private By title =By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By NavBar =By.xpath("//body[1]/header[1]/div[2]/div[1]/nav[1]/ul[1]/li[4]");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	    this.driver= driver;
	}

	public LoginPage getLogin()
	{
		driver.findElement(signin).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
}
