package day3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
/*
 * given()
 *  content type, set cookies,add auth,add param, set headers info etc..
 * 
 * 
 * when()
 * get,post,put,delete
 * 
 * then()
 * 
 * validate status code,extract response,extract headers cookies and response body...
 * 
 */
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Pathandqueryparameters
{
	
	@Test
	void testQueryAndPathParameters()
	{
		given()
		  .pathParam("mypath","users")  //path parameters
		  .queryParam("page",2)
		  .queryParam("id",5)
		  
		.when()
		.get("https://reqres.in/api/{mypath}")
		
		.then()
		  .statusCode(200)
		  .log().all();
	}

}
