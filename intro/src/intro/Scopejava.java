package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scopejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//1 give me the count  of links on the page
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		 //2 get the count of footer links
		WebElement footerdriver=driver.findElement(By.id("gf-BIG")); // this id has all the footer links under it
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//3 get the links of first column in footer section
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //my observatn is even driver.findElement working
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		//4 click on each  link in the column n check if the pages are opening
		 for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)    // for loop is for opening links in seperate tabs
		 {
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			 
		 }
		 Set<String> abc=driver.getWindowHandles();
		 Iterator<String> it=abc.iterator();
		 while(it.hasNext())
		 {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		 }
		
		
	}

}
