package stepDefinitions;

import io.cucumber.java.en.*;

public class Uber
{
	@Given("user wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) 
	{
		System.out.println("step 1");
	}

	@When("user select car {string} and pick up point {string} and drop location {string}")
	public void user_select_car_and_pick_up_point_and_drop_location(String carType, String pickupLocation, String Droplocation) 
	{
		System.out.println("step 2");

	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() 
	{
		System.out.println("step 3");

	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey()
	{
		System.out.println("step 4");

	}

	@Then("user pays {int} USD")
	public void user_pays_usd(Integer int1) 
	{
		System.out.println("step 5");

	}

}
