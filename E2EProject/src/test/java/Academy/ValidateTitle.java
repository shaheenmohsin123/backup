package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	public static Logger Log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		Log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		Log.info("Navigated to homepage");
		
	}
	
	@Test
	public void validateAppTitle() throws IOException
	{
		
		LandingPage l= new LandingPage(driver);
		
		Assert.assertEquals(l.getTitle().getText(), "FEATURED 123COURSES");
		Log.info("Successfully validated Text message");
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
