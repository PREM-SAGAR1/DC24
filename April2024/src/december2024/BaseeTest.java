package december2024;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseeTest {

	public static WebDriver driver;
	
	public static String projectPath = System.getProperty("user.dir");
	
	public static Properties p;
		
	public static Properties mainprop;
	
	public static Properties childProp;
	
	public static Properties orProp;
	
	public static FileInputStream fis;
	
	public static ExtentReports rep;
	
	public static void init() throws Exception
	{
		
	 fis = new FileInputStream(projectPath+"\\data.properties");
	 p =new Properties();
	p.load(fis);
	
	
	fis = new FileInputStream(projectPath+"\\environment.properties");
	mainprop= new Properties();
	mainprop.load(fis);
	String e =mainprop.getProperty("env");
	System.out.println(e);
	
	fis = new FileInputStream(projectPath+"\\"+e+".properties");
	childProp = new Properties();
	childProp.load(fis);
	System.out.println(childProp.getProperty("amazonurl"));
	
	fis = new FileInputStream(projectPath+"\\or.properties");
	orProp = new Properties();
	orProp.load(fis);
	
	fis = new FileInputStream(projectPath+"\\log4j.config.properties");
	   
	PropertyConfigurator.configure(fis);
	
	rep = ExtentManager.getInstance();
	
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
		   WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\April2023\\geckodriver.exe");
		
			driver = new FirefoxDriver();
			
		
		}
	}
	
	
	public static void navigateUrl(String url)
	{
		
		driver.navigate().to(childProp.getProperty(url));
	}

	
	
	

	

	public static void selectOption(String locatorkey, String option) 
	{
		
		//driver.findElement(By.id(orProp.getProperty(locatorkey))).sendKeys("option");
		getElement(locatorkey).sendKeys(option);

	
	}
	public static void typeText(String locatorkey, String text)
	{
		//driver.findElement(By.name(orProp.getProperty(locatorkey))).sendKeys("text");
		getElement(locatorkey).sendKeys(text);

	}
	public static void clickElement(String locatorkey)
	{
		//driver.findElement(By.xpath(orProp.getProperty(locatorkey))).click();
	
	getElement(locatorkey).click();
	}

	public static WebElement getElement(String locatorkey) 
	{
		
		//check for presence of element
		
		if(!isElementPresent(locatorkey))
		{
			System.out.println("Element is not present : "+locatorkey);
		}
		
		if(!isElementVisible(locatorkey))
		{
			System.out.println("Element is not visible :"+locatorkey);
		}
		WebElement element=null;
		
		element = driver.findElement(getlocator(locatorkey));
		
		return element;
		
		
	}

	private static boolean isElementVisible(String locatorkey) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean isElementPresent(String locatorkey) 
	{
		System.out.println("checking for the element presence : "+locatorkey);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
try
{
	
wait.until(ExpectedConditions.presenceOfElementLocated(getlocator(locatorkey)));
}
catch(Exception e)
{
	return false;
}
		return true;
	}
	
	
	public static By getlocator(String locatorkey)
	{
		By by = null;
		
		if(locatorkey.endsWith("_id"))
		{
			by= By.id(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_name"))
		{
			by= By.name(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_classname"))
		{
			by= By.className(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_xpath"))
		{
			by= By.xpath(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_linktext"))
		{
			by= By.linkText(orProp.getProperty(locatorkey));
		}
		
		
		
		return by;
	}
	
	public static boolean isLinkEqual(String expectedLink) 
	{
		
		String actualLink =driver.findElement(By.linkText("Customer Service")).getText();
		
		if(actualLink.equals(expectedLink))
		
		
		return true;
		else
		return false;
	}
	
	public static void reportFailure(String string) 
	{
		
	}
	
	public static void reportSuccess(String string) 
	{
		
	}
	
	
	public static void takeScreenshot() throws Exception
	{
	   Date dt = new Date(0);
	   
	   System.out.println(dt);
	   
	   String dateFormat = dt.toString().replace(":", "_").replace(" ","_")+".png";
	   
	   
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	    FileHandler.copy(scrFile,new File(projectPath+"//failurescrrenshots//"+dateFormat));
	}
	

}
