package stepsForHOOKS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps 
{
	
	WebDriver driver = null;
	
	@Before(value="@smoke",order=1)
	public void browserSetup()
	{
		
		System.out.println("i am inside the browser setup");
		System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");;
	
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(05,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(05,TimeUnit.SECONDS);
	
	}
	
	@Before(order=2)
	public void setup2()
	{
		System.out.println(" iam inside setup2");
	}
	
	
	@After(order=1)
	public void Teardown()
	{
		
		System.out.println("iam inside th tear down 1");
		driver.close();
		driver.quit();
	}
	
	@After(order=2)
	public void Teardown2()
	{
		
		System.out.println("iam inside th tear down2");
		driver.close();
		driver.quit();
	}
	
	@BeforeStep
	public  void beforeSteps()
	{
		System.out.println("iam inside beforeSteps----");
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.println("i am inside afterSteps");
	}
	@Given("user is on login page")
	public void user_is_on_login_oage() 
	{
	   System.out.println("user is on login page");
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() 
	{
	   System.out.println("user enters valid username and password"); 
	}
	@When("clicks on login button")
	public void clicks_on_login_button()
	{
	  System.out.println("clicks on login button");  
	}
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() 
	{
		System.out.println("user is navigated to the homepage");
	   
	}

}
