package api.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndpoints;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests
{
	Faker faker;
	User userPayload;
	@BeforeClass
	public void SetUpData()
	{
		faker = new Faker();
		userPayload = new User();
		
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5,10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
	}
	
	@Test(priority=1)
	public void testPostUser()
	{
		Response response  =UserEndpoints.createUser(userPayload);	
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
	
	}

	@Test(priority = 2)
	public void testGetUserByName()
	{
		Response response = UserEndpoints.readUser(this.userPayload.getUsername());
	response.then().log().all();
	Assert.assertEquals(response.getStatusCode(),200);
	}
	
	@Test(priority=3)
	public void testUpdateUserByName()
	{
		//update data using payload
		
		userPayload.setFirstName(faker.name().firstName());
		
		
		userPayload.setLastName(faker.name().lastName());
		
		userPayload.setLastName(faker.internet().safeEmailAddress());

	Response response =UserEndpoints.updateUser(this.userPayload.getUsername(),userPayload);
	response.then().log().body().statusCode(200);
	
	Assert.assertEquals(response.getStatusCode(),200);
	
	//checking
	Response responseAfterupdate = UserEndpoints.readUser(this.userPayload.getUsername());
	response.then().log().all();
	Assert.assertEquals(responseAfterupdate.getStatusCode(),200);
	
	}
	
	public void testDeleteUserNyName()
	{
		Response response =UserEndpoints.deleteUser(this.userPayload.getUsername());
	
		Assert.assertEquals(response.getStatusCode(),200);
		
	}
	
	
	
}
