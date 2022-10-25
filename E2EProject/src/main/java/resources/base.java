package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class base {
    public  WebDriver driver;
	public Properties prop;
    public WebDriver initializeDriver() throws IOException
	{
	  prop=new Properties();
	  FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	  prop.load(fis);	
	//  String browserName= System.getProperty("browser");
      String browserName=prop.getProperty("browser");
	  if(browserName.contains("chrome"))
	   {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
		 if(browserName.contains("headless"))
		 {
			 options.addArguments("headless");
		 }
		 driver = new ChromeDriver(options);
	   }	 
		 else if(browserName.equals("firefox"))
	  {
		  //execute in firefox
	  }
	  else if (browserName.equals("IE"))
	  {
		  //execute in IE(Internet Explorer)
	  }
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	return driver;
	  
	  
	}
	
    
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);	
		String destinationFile = System.getProperty("user.dir")+"/reports/"+testCaseName+".png";
		FileHandler.copy(source, new File(destinationFile));
		return destinationFile;
	}
	
	
	
}
