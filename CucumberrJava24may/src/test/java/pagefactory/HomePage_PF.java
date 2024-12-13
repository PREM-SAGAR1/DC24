package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF 
{
	 
	
	@FindBy(xpath = "//a[text()='Logout']" )
	WebElement btn_logout;
	
     @FindBy(xpath = "//button[text()='Open Menu']")
	WebElement btn_menu;
     
     WebDriver driver;
     
     public HomePage_PF(WebDriver driver)
     {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
     }
     public void clickOnMenu()
     {
    	 btn_menu.click();
     }
     
     public void checkLogoutIdDispalyed()
     {
    	 btn_logout.isDisplayed();
     }
     
}
