package stepsforHooks;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps 
{
	WebDriver driver =null;
	
	@Before(value="@smoke",order=1)
	public void browserSetup()
	{
		System.out.println(" iam inside browser setup");
		String ProjectPath = System.getProperty("user.dir");

		
		System.setProperty("webdriver.chrome.driver",ProjectPath+"//src//test//resources//drivers//chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    
	}
	
	@Before(order=2)
	public void setup2()
	{
		System.out.println("iam inside setup2\n");
	}
	
	@After(order=1)
	public void teardown()
	{
		
		System.out.println(" iam inside tear down");
		driver.close();
		driver.quit();
		
	}
	@After(order=2)
	public void teardown2()
	{
		
		System.out.println(" iam inside tear down 2");
		driver.close();
		driver.quit();
	}
	@BeforeStep
	public  void beforeSteps() 
	{
		System.out.println(" i am inside beforeSteps");
		
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.println(" i am inside aftersteps");
	}
	
	    @Given("user is on login page")
	public void user_is_on_login_page() 
	{
		
		}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() 
	{
		
		}
	@And("clicks on login button")
	public void clicks_on_login_button() 
	{
		
		}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() 
	{
		
		}




}
