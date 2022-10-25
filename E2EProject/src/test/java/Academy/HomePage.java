package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordNext;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger Log= LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();

	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage l= new LandingPage(driver);
	 	LoginPage lp =l.getLogin();
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		Log.info("Text");
		lp.getLogin().click();
		ForgotPasswordNext fp =lp.ForgotPassword();
		fp.getEmail().sendKeys("shahee");
		fp.SendInstructions().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[2][2];
		data[0][0] = "nonrestricteduser";
		data[0][1] ="123456";
		Log.info("nonrestricted user");
		data[1][0] ="restricteduser";
		data[1][1] = "6789";
		Log.info("restricteduser");
		return data;
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
}
