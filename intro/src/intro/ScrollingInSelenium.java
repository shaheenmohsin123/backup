package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); //when u run the script it will scroll down in the browser
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000 "); //make sure single quote inside for css
		                                                                               //above for scrolling inside table vertically
	//	js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500"); // my observation, still works when slash comes Bydefault
		                                                                             // coz of slash double quote for css ignored
		
		//below for summing up elements in inner table of the widow
		List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{		
		   sum = sum +Integer.parseInt(values.get(i).getText());
		}
	    System.out.println(sum);
	    
	    //comparing sum with the number under the table which says: Total Amount collected: 296
	    //System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText()); //complete string is extracted
	    driver.findElement(By.cssSelector(".totalAmount")).getText();	
	   int total =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim()); //splitting string n converting to integer
	   Assert.assertEquals(sum, total); //comparing 
	 
	    	
	}

}
