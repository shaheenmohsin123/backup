package intro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pdfsimpli.com/lp/pdf-to-jpg_v3?account=F104SWJK&campaignid=319227708&adgroupid=1153388096137679&keyword=convert%20pdf%20to%20jpg&gclid=&source=o&matchtype=e&location=65452&caid=523526864&msclkid=9b84a7103fa013783d57c5e6614b0c01");
		driver.findElement(By.cssSelector("[id*='dragUploadPdfMain']")).click();
		Runtime.getRuntime().exec("C:\\Users\\shahe\\OneDrive\\Documents\\fileupload.exe");
	}

}
