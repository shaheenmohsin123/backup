package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class MyStepDefinitions extends base {

	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		driver = initializeDriver();
	  
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
	 
	}

	@Given("^Click on login link in home page to land on secure sign in page$")
	public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		LandingPage l= new LandingPage(driver);
		LoginPage lp = l.getLogin();
		
	 
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and  logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(arg1);
		lp.getpassword().sendKeys(arg2);
		lp.getLogin().click();
	 
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	  System.out.println("success");
	   
	}


}