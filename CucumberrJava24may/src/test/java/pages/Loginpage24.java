package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage24
{
	protected WebDriver driver;
	
	
	private By txt_username = By.id("user-name");
	
	private By txt_password = By.id("password");
   
	private  By btn_login = By.id("login-button");
   
	private By btn_Menu = By.xpath("//button[text()='Open Menu']");
   
	private By btn_logout = By.xpath("//a[text()='Logout']");
   
   public Loginpage24(WebDriver driver)
   {
	  this.driver = driver;
	 
   }
   public void enterUsername(String username)
   {
	   driver.findElement(txt_username).sendKeys(username);
   }
   
   public void enterPassword(String password)
   {
	   driver.findElement(txt_password).sendKeys(password);
   }
   
   
   public void clickLogin()
   {
	 driver.findElement(btn_login).click();  
   }
   
   public void clickMenu()
   {
	  driver.findElement(btn_Menu).click(); 
   }
   
   public void checkLoutIsDisplayed()
   {
	   driver.findElement(btn_logout).isDisplayed();
   }
   
}