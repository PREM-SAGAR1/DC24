package december2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webcalanders {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://goibibo.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		//driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();

		
		while(!driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]")).getText().contains("June 2025"))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		
	    List<WebElement> datelist = driver.findElements(By.xpath("//div[@class='DayPicker-Body']/div/div"));
		
		for(int i=0;i<datelist.size();i++)
		{
			String dateText = datelist.get(i).getText();
			if(datelist.get(i).getText().equals("14"))
			{
				datelist.get(i).click();
				break;
			}
		}
		
		
		
		
	}

}
