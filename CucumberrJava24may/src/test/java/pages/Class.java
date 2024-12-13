package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class 
{
	public static WebDriver driver;
	
	public  static String projecto = System.getProperty("user.dir");
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver",projecto+"//src//test/resources//drivers//geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/v1/index.html");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
	}


	
	
	

}
