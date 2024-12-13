package stepDefinitions;

import amazonimplementation.Product;
import amazonimplementation.Search;
import io.cucumber.java.en.*;

public class SearchSteps 
{
	Product  product;
	Search search;
	
	@Given("i have search field on amazon page")
	public void i_have_search_field_on_amazon_page() 
	{
	System.out.println("Step 1: i am on search field");	
	}
	@When("i search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price)
	{
		System.out.println("Step 2: search product name : " +productName+"price"+price);
	product = new Product(productName,price);
	
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) 
	{
		System.out.println("Step 3:" +productName+ "is displayed");
	
	search = new Search();
	String name = search.displayProduct(product);
	System.out.println("searched prodcut is :"+name);
	}
	

}
