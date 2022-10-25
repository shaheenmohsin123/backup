package intro;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learning1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w=new WebDriverWait(driver,5);   //working with explicit wait so commenting above
		
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
        addItems(driver,itemsNeeded); //till here everything gets added to the cart
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode"))); //explicit wait for below aftr comentingout implicit
        driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy"); // no success coz thez prob(implicit ex )
                                                                                              // above implict wait should be declared
        driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"))); //explicit for below as loading text is taking time
        
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText()); // to grab text after applying code
        
	}

	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");	
			String formattedName=name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
		
			if(itemsNeededList.contains(formattedName))
			
			{
			     j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==3) 
				{ 
			     break;
			    }
				        
			}
	}

	}
}
