package december2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hi {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");
		
       WebDriver driver = new FirefoxDriver();
       
       driver.get("https://www.google.com");
       
       driver.manage().window().maximize();
	}

}
