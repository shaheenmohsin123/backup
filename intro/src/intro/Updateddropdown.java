package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Updateddropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	/*	driver.findElement(By.id("divpaxinfo")).click();
	
		int i=1;
	    while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		} 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //to print 1 adult
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click(); 
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  */ // to print 5 adult
		
		//dynamic dropdown
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
	    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		// driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click(); //alternate for the above code, here parentchild relation xpath used
	   
	    
	    
	    }
        }
		
		
		
		
	

        
