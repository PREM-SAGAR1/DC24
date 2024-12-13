package december2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import freemarker.log.Logger;

public class TC_003 extends BaseeTest
{
	
      private static final Logger log = Logger.getLogger("TC_003");
    		  
	public static void main(String[] args) throws Exception
	{
		init();
		log.info("init the properties files....");
		
		
		launch("firefoxbrowser");
		log.info("launching the browser :-"+p.getProperty("chromebrowser"));
		
		
		navigateUrl("amazonurl");
		log.info("Navigated  to url :  "+childProp.getProperty("amazonurl"));
		
		
		
		selectOption("amazondropdown_id","Books");
		
		log.info("selected the option By using the locator "+orProp.getProperty("amazondropdown_id"));
	typeText("amazontextbox_name","Harry Potter");
		
	
	
	
		clickElement("amazonsearchbutton_xpath");
		
		driver.findElement(By.partialLinkText("Customer Ser")).click();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<elements.size();i++)
		{
			if(!elements.get(i).getText().isEmpty())
			System.out.println(elements.get(i).getText());
		}
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));

		//loc.sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
	
		//driver.findElement(By.id("nav-search-submit-button")).click();
	
	}

	

}
