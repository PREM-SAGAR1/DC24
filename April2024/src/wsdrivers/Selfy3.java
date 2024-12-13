package wsdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selfy3 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\\\April2023\\\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		

		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a"));
		 * 
		 * for(int i=1;i<links.size();i++) { System.out.println(links.get(i).getText());
		 * }
		 */
	
		List<WebElement> l = driver.findElements(By.id("//div[@id='SIvCob']/a"));

		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
	
	
	}

}
