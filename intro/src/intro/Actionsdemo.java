package intro;

import static org.junit.Assert.fail;
import static org.testng.Assert.fail;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //to maximize the screen
		//driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		
	//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//moves to specific element
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		//WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']")); //creating webelement for above
		//a.moveToElement(move).contextClick().build().perform();
	 
		
		//how to work between multiple windows
      /*  driver.get("https://rahulshettyacademy.com/loginpagePractise/#"); 
		driver.findElement(By.cssSelector(".blinkingText")).click();
	    Set<String> windows=driver.getWindowHandles();  //parentid,childid
	    Iterator<String> it=windows.iterator();  
	   String parentId = it.next();
	   String childId = it.next();
	   driver.switchTo().window(childId);
	   System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText()); //getting text from child window
	   String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	   System.out.println(emailId);
	    driver.switchTo().window(parentId);
	    driver.findElement(By.id("username")).sendKeys(emailId); */
	    driver.get("https://www.ebay.com/");
	    driver.findElement(By.linkText("Motors")).click();
	}

}
