package intro;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//checking the checkbox
	/*	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		// counting the checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());   */
		
		//assignment2// flop
		//assignment3 , to get  the text after clicking the 2nd link in  the page  using explicit wait
		/* driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
	    driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax')]")).click();
	    WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText()); */
		/*   driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
             driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
             WebDriverWait d=new WebDriverWait(driver,20);
             d.until(ExpectedConditions.elementToBeClickable(By.id("results")))
             System.out.println(driver.findElement(By.id("results")).getText()); */ //answer for assignment3
		
		//assignment4    //window handling assignment
		  /*driver.get("https://the-internet.herokuapp.com/windows");
		  driver.findElement(By.cssSelector("[class='example'] a")).click();
	      Set<String> windows=driver.getWindowHandles();
		  Iterator<String>  it= windows.iterator();
		  String parentId =it.next();
		  String childId =it.next();
		  driver.switchTo().window(childId);
		  System.out.println(driver.findElement(By.cssSelector("[class='example'] h3")).getText());
		  driver.switchTo().window(parentId);
		  System.out.println(driver.findElement(By.cssSelector("[class='example'] h3")).getText()); */
		  
		  //answers for assignment4
		  /*driver.get("http://the-internet.herokuapp.com/");
          driver.findElement(By.linkText("Multiple Windows")).click();
          driver.findElement(By.cssSelector("a[href*='windows']")).click();
          Set<String> abc=driver.getWindowHandles();
          Iterator<String> it=abc.iterator();
          String parentWindow=it.next();
          driver.switchTo().window(it.next());
          System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
          driver.switchTo().window(parentWindow);
          System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText()); */

		  //assignment5 //nested frames //need to print the text of middle frame
		  /*driver.get("http://the-internet.herokuapp.com/");
		  driver.findElement(By.linkText("Nested Frames")).click();
		  driver.switchTo().frame("frame-top");
		  driver.switchTo().frame("frame-middle");
		  System.out.println(driver.findElement(By.id("content")).getText()); */
		
		//assignment6
	/*	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();  //to checkmark the box
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText(); //to grab the text n transfer down 
		WebElement sd=driver.findElement(By.id("dropdown-class-example"));
		Select d=new Select(sd);
		d.selectByVisibleText(opt); //thats why variable is created in string form	
		driver.findElement(By.name("enter-name")).sendKeys(opt); //no quotes for opt as its string
		driver.findElement(By.id("alertbtn")).click(); //to click on the alert box
		 System.out.println(driver.switchTo().alert().getText()); //to print the text in alert box
		  String text=driver.switchTo().alert().getText(); //v have to check if option2 label is present in alert message
		  if(text.contains(opt))
		  {
			  System.out.println("text present");
		  }
		  else
		  {
			  System.out.println("failed");
		  }    */
		
		  // Assignment 7
	/*	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,600)");
		  WebElement table=driver.findElement(By.id("product"));
		  System.out.println(table.findElements(By.tagName("tr")).size()); //printing number of rows
	      System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size()); //printing no.of columns
	      List<WebElement> secondRow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")); //printing 2nd row of data
	      System.out.println(secondRow.get(0).getText());
	      System.out.println(secondRow.get(1).getText());
	      System.out.println(secondRow.get(2).getText());    */
	      
	      //Assignment 8
	    /*  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.findElement(By.id("autocomplete")).sendKeys("uni");
	      Thread.sleep(3000);
	   List<WebElement> options = driver.findElements(By.cssSelector("[class='ui-menu-item'] div"));
	   for(WebElement option:options)
	   {
		   if(option.getText().equalsIgnoreCase("United States (USA)"))
		   {
			   option.click();
			   break;
		   }     
	   }         */    //old method
		
		//new and easy
	/*	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	      driver.findElement(By.id("autocomplete")).sendKeys("ind");
	      Thread.sleep(3000);
	      driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	      driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	      System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); */
	      
	     
	}

}
