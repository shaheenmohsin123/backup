package intro;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.path2usa.com/travel-companions");
		//driver.findElement(By.id("travel_date")).click();
		  driver.findElement(By.xpath("//*[@id='travel_date']")).click(); //to click on date window
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		  List<WebElement> dates= driver.findElements(By.className("day"));
		  int count=driver.findElements(By.className("day")).size();
		 for(int i=0;i<count;i++)
		 {
		 String text=driver.findElements(By.className("day")).get(i).getText();
		 if(text.equalsIgnoreCase("27"))
		  {
		 driver.findElements(By.className("day")).get(i).click();
		 break;
		  }
		 } 
	}

}
