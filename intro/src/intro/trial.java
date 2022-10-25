package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class trial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("SSSSSSSSSSSSSSSS");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	 
     //driver.get("http://facebook.com");
 //driver.findElement(By.id("email")); // cursor moves to that point in facebook page, ready to type
     //driver.findElement(By.id("email")).sendKeys("I am the best"); // with this edit box is written
    // driver.findElement(By.name("pass")).sendKeys("123456");
    // driver.findElement(By.linkText("Forgot Password?")).click();
    
     //driver.get("http://login.salesforce.com");
    //driver.findElement(By.id("username")).sendKeys("I did it");
    // driver.findElement(By.name("pw")).sendKeys("123456");
    // driver.findElement(By.className("input r4 wide mb16 mt8 password")).click(); //error
     //the above doesnt work as classes should not have spaces
      
     //driver.findElement(By.xpath("//*[@id='Login']")).click();
     //driver.findElement(By.cssSelector("div#error.loginError")).getText(); //to get the displayed text
     //System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
    //Please check your username and password. If you still can't log in, contact your Salesforce administrator.
   // above is the message  printed n expected due to wrong credentials
     
    // driver.get("http://facebook.com");
     //driver.findElement(By.cssSelector("#email")).sendKeys("kids"); // error do in firefox
    // driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("mine"); // error "   "
     //driver.findElement(By.linkText("Forgot Password?")).click();    // error "   "
     
     //driver.get("http://google.com");
     //driver.findElement(By.xpath("//div[@jscontroller='JGHKP']/input")).sendKeys("world");
		
	/*	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText()); */
		
		//Autosuggestive dropdowns
	/*	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
	     List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));     //note here its findElements as all options are extracted
	     for(WebElement option :options)
	     {
	    	 if(option.getText().equalsIgnoreCase("India"))
	    	 {
	    		 option.click();
	    		 break;
	    	 }
	    	 
	     }    */
		//handling checkbox and getting the size of them
	/*	driver.get("https://book.spicejet.com/");
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected()); //to know if selected, if not will give true or false
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());*/ //here true will be given n above false
		
		//count the number of checkboxes
		   // System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size()); // First find the common locator, note its findelements here
		 
		// from , to and  calender selection
	/*	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();  */
		
		
	
	}

}
