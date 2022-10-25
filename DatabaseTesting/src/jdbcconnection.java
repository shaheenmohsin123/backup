import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
         String host="localhost";
         String port="3306";
	Connection con=	DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "root", "myjob");
	Statement s=con.createStatement();
	ResultSet rs= s.executeQuery("select*from Employeeinfo where name='tam'");
	while(rs.next())
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys(rs.getString("location"));
		driver.findElement(By.id("password")).sendKeys(rs.getString(2));
		//System.out.println(rs.getString("location"));
		//System.out.println(rs.getString(2));
	}
	
	}

}

