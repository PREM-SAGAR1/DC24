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

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
public class HeadersDemo 
{
	@Test(priority=1)
	void testHeaders()
	{
		given()
		
		.when()
		  .get("https://www.google.com/")
		  
		  .then()
		  .header("Content-Type","text/html; charset=IS0-8859-1")
		  .header("Content-Encoding","gzip")
		  .header("Server","gws");
		
	
	}
	
	
		
	
	
	
	
	
	}
	
	
	
	



