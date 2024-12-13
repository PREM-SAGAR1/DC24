package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginDemoSteps_POM
{
	
//	WebDriver driver;
//	LoginPage login;
//	
//	@Given("browser is open")
//	public void browser_is_open()
//	{
//		System.out.println("==== iam inside LoginDemo");
//		String ProjectPath = System.getProperty("user.dir");
//		
//		      System.out.println("inside step : browser is open");
//			System.setProperty("webdriver.chrome.driver",ProjectPath+"\\src\\test\\resources\\drivers\\chromedriver.exe");
//		     
//			driver = new ChromeDriver();
//			
//			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//			
//			driver.manage().window().maximize();
//		}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() 
//	{
//		
//		
//		
//		driver.navigate().to("https://example.testproject.io/web/");
//		}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username,String password) throws Exception 
//	{
//		
//		login = new LoginPage(driver);
//		
//		login.enterUsername(username);
//		login.enterPassword(password);
//
////		driver.findElement(By.id("name")).sendKeys(username);
////		driver.findElement(By.id("password")).sendKeys(password);
////	
//		Thread.sleep(2000);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() 
//	{
//		login.clickLogin();
//		
//		//driver.findElement(By.id("login")).click();
//
//	    }
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() 
//	{
//		login.checkLogoutDisplayed();
//		//driver.findElement(By.id("logout")).isDisplayed();
//		
//		driver.close();
//		}

}
