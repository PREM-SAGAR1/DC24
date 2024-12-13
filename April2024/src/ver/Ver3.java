package ver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import december2024.BaseeTest;

public class Ver3 extends BaseeTest 
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launch("firefoxbrowser");
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		
		String expectedLink = "Customer Service";
		
		if(!isLinkEqual(expectedLink))
		reportFailure("Both links are not equal");
			
			else
				reportSuccess("Both links are equal");
		

	
	

}

}
