package ver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\\\April2023\\\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		//String actualValue = driver.findElement(By.linkText("Customer Service")).getText();

		
		String actualValue = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");

		String expectedValue = "customer Serivce";
		
		System.out.println("Actual links :"+actualValue);
		
		System.out.println("Expected links : "+expectedValue);
		
		
		//if(actualValue.equals(expectedValue))
		if(actualValue.contains(expectedValue))

			System.out.println("Both links are equal.....");
		else
		{
			System.out.println("Both links are not equal....");
		}
	}

}
