package finale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver=new FirefoxDriver();
		
		//driver.get("https://www.facebook.com");
		
		
		
		System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driverr = new FirefoxDriver();
		
		driverr.get("https://opensource-demo.orangehrmlive.com/");

		driverr.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Admin");
	     
	     driverr.findElement(By.xpath("//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("admin123");

	}

}
