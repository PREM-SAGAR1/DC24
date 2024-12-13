package wsdrivers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy4 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "D:\\\\April2023\\\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> l = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for(int i=0;i<l.size();i++)
		{
			String linkname = l.get(i).getText();
			l.get(i).click();
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\Prem\\Desktop\\Screens\\ss\\"+linkname+".png"));
			 l = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

		
		}
		
	}

}
