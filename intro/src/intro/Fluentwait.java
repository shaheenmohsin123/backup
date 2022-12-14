package intro;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		 //syntax copied from google(FluentWait selenium)
		  WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     //concentrate on below two
		     public WebElement apply(WebDriver driver) {              // our WebElement is 'Hello World!'(waiting to display this)
		     if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
		      {
		        return driver.findElement(By.cssSelector("[id='finish'] h4")); 
		      }  
		      
		      else
		    	  return null;
		      
		  
		     }
		   });     
		   System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
	
	
	
	
	}

}
