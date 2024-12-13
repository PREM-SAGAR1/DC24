package decPract24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaserTest 
{
	
	public static WebDriver driver;
	
	public static FileInputStream fis;
	
	public static String projectPath = System.getProperty("user.dir");
	
	public static Properties p;
	
	public static Properties mainProp;
	
	public static Properties orProp;
	
	public static Properties Mainprop;
	
	public static Properties childProp;
	
	
	public static void init() throws Exception
	{
	fis = new FileInputStream(projectPath+"\\data.properties");	
	p=new Properties();
	p.load(fis);
	
	fis = new FileInputStream(projectPath+"\\environment.properties");
	mainProp = new Properties();
	mainProp.load(fis);
	
	String e = mainProp.getProperty("env");
	
	System.out.println(e);
			
	
	fis = new FileInputStream(projectPath+"\\"+e+".properties");
	childProp=new Properties();
	childProp.load(fis);
	
	System.out.println(childProp.getProperty("amazonurl"));
			
			
			
	fis = new FileInputStream(projectPath+"\\or.properties");
	orProp = new Properties();
	orProp.load(fis);
	
	}
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","");
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\April2023\\geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
	}
	
	
	public static void Navigateurl(String url)
	{
		
		driver.navigate().to(childProp.getProperty(url));
	}
	
	

	public static void SelectOption(String locatorkey, String option)
	{
		
		//driver.findElement(By.id(orProp.getProperty(locatorkey))).sendKeys(option);
	getElement(locatorkey).sendKeys(option);
	
	}
	
	
	public static void TypeText(String locatorkey, String text) 
	{
		//river.findElement(By.name(orProp.getProperty(locatorkey))).sendKeys(text);
		getElement(locatorkey).sendKeys(text);
	}
	public static void clickSearch(String locatorkey) 
	{
		//driver.findElement(By.xpath(orProp.getProperty (locatorkey))).click();
		getElement(locatorkey).click();
	}

	
	private static WebElement getElement(String locatorkey)
	{
		
		//check for the presence of the element
		
		if(!isElementPresent(locatorkey))
		{
			System.out.println("Element is not present : "+locatorkey);
		}
		
		WebElement element = null;
		
		element =driver.findElement(getlocator(locatorkey));
		
		
		return element;
	}
	
	public static boolean isElementPresent(String locatorkey) 
	{
		
		System.out.println("checking for the element presenc : "+locatorkey);
		
		
		WebDriverWait wait  = new WebDriverWait(driver, 30);
		
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

	public  static By getlocator(String locatorkey) 
	{
		By by =null;
		
		
		if(locatorkey.endsWith("_id"))
		{
			by=By.id(orProp.getProperty(locatorkey));
		}
		else  if(locatorkey.endsWith("_name"))
		{
			by=By.name(orProp.getProperty(locatorkey));
		}
		else  if(locatorkey.endsWith("_classname"))
		{
			by=By.className(orProp.getProperty(locatorkey));
		}
		else  if(locatorkey.endsWith("_xpath"))
		{
			by=By.xpath(orProp.getProperty(locatorkey));
		}
		else  if(locatorkey.endsWith("_partiallinktext"))
		{
			by=By.partialLinkText(orProp.getProperty(locatorkey));
		}
		else  if(locatorkey.endsWith("_linktext"))
		{
			by=By.linkText(orProp.getProperty(locatorkey));
		}
		
		
		
		
		
		return null;
	}
	
	

}
