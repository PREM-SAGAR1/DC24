package day3;

import org.testng.annotations.Test;

import com.github.scribejava.core.model.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

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

public class CookiesDemo 
{
	@Test(priority=1)
	void testCookies()
	{
		given()
		
		.when()
		  .get("https://www.google.com/")
		  
		  .then()
		  .cookie("AEC")
		  .log().all();
	}
	
	@Test(priority=2)
	void getCookiesInfo()
	{
		io.restassured.response.Response res =given()
		
		.when()
		   .get("https://www.google.com/");
		
		//get single cookie info
		
		String cookie_Value =res.getCookie("AEC");
	
	System.out.println("value of cookie is ===>"+cookie_Value);
	
	
	//get all cookies info
	
	Map<String, String> cookies_values = res.getCookies();
	
	for(String k:cookies_values.keySet())
	{
		String cookie_value=res.getCookie(k);
		System.out.println(k+"   "+cookie_value);
	}
	}

}
