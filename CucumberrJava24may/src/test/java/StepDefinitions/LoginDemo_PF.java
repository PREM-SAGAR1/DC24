package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import pagefactory.HomePage_PF;
import pagefactory.Loginpage_PF_24;

public class LoginDemo_PF 
{
	
	
	 WebDriver driver=null;
	
	public String projectPath = System.getProperty("user.dir");
	
	Loginpage_PF_24 login;
	
	HomePage_PF home;
	
	
	@Given("browser is open")
	public void browser_is_open() 
	{
		System.out.println("IAM INSIDE THIS  LoginDemo_PF CLASS");
		System.setProperty("webdriver.gecko.driver",projectPath+"//src//test//resources//drivers//geckodriver.exe");
	
	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	
		
	}

	@And("user is on login page")
	public void user_is_on_login_page() 
	{
		System.out.println("user is on the homepage");
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws Exception 
	{ 
		 login = new Loginpage_PF_24(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		Thread.sleep(2000);
     }

	@And("user clicks on login")
	public void user_clicks_on_login() 
	{
     login.clickonLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws Exception 
	{
		home = new HomePage_PF(driver);
		
		home.clickOnMenu();
		
		home.checkLogoutIdDispalyed();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}




}
