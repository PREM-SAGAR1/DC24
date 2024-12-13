package december2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTablePagenation {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");
		
		WebDriver  driver = new FirefoxDriver();
		
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");

		driver.manage().window().maximize();
	
	       int pageMaxSize=   driver.findElements(By.cssSelector("div[class='dt-paging paging_full_numbers']>button)")).size();

		System.out.println("Total number of pages :"+pageMaxSize);
	
		for(int i=1;i<=pageMaxSize;i++)
		{
			
			String pageSelector = "div[class='dt-paging paging_full_numbers']>button:nth-child("+i+")";
	driver.findElement(By.cssSelector(pageSelector)).click();
		 List<WebElement> ElementNames = driver.findElements(By.cssSelector("table[id='example']>tbody>tr>td:first-child"));
		
		 for(WebElement elementName:ElementNames)
		 {
			 System.out.println(elementName.getText());
		 }
		 
		 Thread.sleep(1000);
		
		}
		
	
	}

}
