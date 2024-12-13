package day4;

import org.testng.Assert;
import org.testng.annotations.Test;
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

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import com.github.scribejava.core.model.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
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
import java.util.HashMap;

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
public class PassingJSONResponseData 
{
		//approach1
		
		/*given()
		      .contentType("ContentType.JSON")
		   .when()
		      .get("http://localhost:3000/students")
		.then()
		.statusCode(200)
        .body("students[2].phone",equalTo("98778456"));*/
	
		//Approach2
		
		/*io.restassured.response.Response res =given()
		  .contentType("ContentType.JSON")
		  .when()
		    .get("http://localhost:3000/students");
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.header("Content-Type"),"application/json; charset=utf-8");   
	
	String	phonem=res.jsonPath().get("students[2].phone").toString();
	
	Assert.assertEquals(phonem, "98778456");*/
	
	@Test
	void testJsonResponseBodyData()
	{
		io.restassured.response.Response res =given()
				  .contentType(ContentType.JSON)
				  .when()
				    .get("http://localhost:3000/students");
	
	
	JSONObject jo = new JSONObject(res.asString());
	
	for(int i=0;i<jo.getJSONArray("students").length();i++)
	{
		String booktitle =jo.getJSONArray("students").getJSONObject(i).get("location").toString();
	
		System.out.println(booktitle);
	
	
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	   
	

}
