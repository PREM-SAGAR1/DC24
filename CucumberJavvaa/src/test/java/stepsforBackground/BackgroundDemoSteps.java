package stepsforBackground;

import io.cucumber.java.en.*;

public class BackgroundDemoSteps 
{
	@Given("user is login page")
	public void user_is_login_page() 
	{
		
	   }
	@When("user enters username and password")
	public void user_enters_username_and_password() 
	{
		
	}
	@When("clicks on login button")
	public void clicks_on_login_button() 
	{
		
	   }
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage()
	{
		
	    }



	@Given("user is logged in")
	public void user_is_logged_in() {
		throw new io.cucumber.java.PendingException();
	}
	@When("user clicks on welcome link")
	public void user_clicks_on_welcome_link() {
	}
	@Then("logout link is displayed")
	public void logout_link_is_displayed() {
	}

	
	@When("user clicks on dashboard link")
	public void user_clicks_on_dashboard_link() {
	}
	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
	}

}