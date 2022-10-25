package intro;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); //should have worked saying false, unfortunately
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();    */                 //  doesnt in some, so other method
			
		
		
	/*	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
			System.out.print
			ln(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));   // way to see if enabled or disabled
		
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			
		}  
			else
			{
				Assert.assertTrue(false);
			} */
		// handling  java alerts below
			String text="Rahul"; 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("text"); // even other way works by printing Rahul directly for send keys
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText()); // to print the text before accepting the alert
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();  // to click on the confirm button for alert example in rahuls page
		System.out.println(driver.switchTo().alert().getText()); // getting text before dismissing
		driver.switchTo().alert().dismiss();  // to not accept, button can be 'no', 'cancel' or any negativity in alert popups
		
		//misc topics
	/*	DesiredCapabilities ch=DesiredCapabilities.chrome();
		ch.acceptInsecureCerts(); //any one out of 3
	    ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	    ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	    ChromeOptions c=new ChromeOptions();
	    c.merge(ch);
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);   */   //has to be given at the beginning, the whole code
	    
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("c://Screenshot.png"));
		
		
	}

}
