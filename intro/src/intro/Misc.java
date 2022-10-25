package intro;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;
public class Misc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// SCREEN SHOT
	/*	driver.get("https://www.google.com/");
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\shahe\\Pictures\\Saved Pictures\\screenshot.png")); */
		
		//AUTOMATE THE BROKEN LINKS WITH SELENIUM, ONLY ONE LINK IS CHECKED
	/*	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    String url  = driver.findElement(By.linkText("SoapUI")).getAttribute("href");  // if u change SoapUI to Broken Link, output is 404
	    HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();     // for SoapUI output is
	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    int respCode = conn.getResponseCode();
	    System.out.println(respCode);   */
		
	   
	   //ITERATE OVER ALL LINKS IN THE PAGE TO VALIDATE BROKEN LINKS (still all links not validated below as execution breaks
	    
	/*	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		for(WebElement link : links)
		{
			String url =link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();                                          
			System.out.println(respCode);
			if(respCode > 400)
			  {
				System.out.println( "The link with Text " + link.getText() + " is broken with code" + respCode);
				Assert.assertTrue(false);
			   }      */
		
		
	
		// SoftAssert used to validate all links n report broken link
  /*	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link : links)
		{
			String url =link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();                                          
			System.out.println(respCode);
			a.assertTrue(respCode<400, " The link with Text " + link.getText() + " is broken with code " + respCode);
			                                            	
		}
        a.assertAll();    */
	

	     
		
		
	}

}
