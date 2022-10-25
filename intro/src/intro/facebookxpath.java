package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://facebook.com");
	/*	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='login']")).click(); */
		
	/*driver.findElement(By.cssSelector("input[type='text']")).sendKeys("hello");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("6789");
	driver.findElement(By.cssSelector("[type='submit']")).click(); */
		
/*	driver.get("http://login.salesforce.com");	
	driver.findElement(By.cssSelector("input#username")).sendKeys("helloooo"); */
	
		//*[@id='email']
	//	driver.get("http://facebook.com");
	//	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hello");
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	}

}
