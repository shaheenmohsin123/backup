package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class Loginapplication {

@Test
public void Login()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	RediffLoginpage rd= new RediffLoginpage(driver);
	rd.EmailId().sendKeys("hello");
	rd.Password().sendKeys("123");
	rd.Submit().click();
	rd.Home().click();
	RediffHomepage rh= new RediffHomepage(driver);
	rh.Search().sendKeys("rediff");
	rh.Submit().click();
	
	
	
	
}
	
	
}
