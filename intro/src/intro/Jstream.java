package intro;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Jstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//CHECKING IF WEBTABLE IS SORTED OR NOT USING SELENIUM
	/*	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList= elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList)); */
		
		//CHECKING THE PRICE OF JUST ONE ITEM(here  beans)
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<String> price;
		do
		{	
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		 price=elementsList.stream().filter(s->s.getText().contains("Rice ")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a)); 
		if(price.size()<1)
		{
		  driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
			
		} while(price.size()<1);
	}
	private static String getPriceVeggie(WebElement s) {   
		// TODO Auto-generated method stub
	String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
