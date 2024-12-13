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
public class PassingJSONResponseData2 
{
	
@Test
void jsonTest()
{
	/*given()
	.contentType("ContentType.JSON")
	
	.when()
	.get("http://localhost:3000/students")
	
	.then()
	.statusCode(200)
	.header("Content-Type","application/json; charset=utf-8")
	.body("students[1].location",equalTo("US"));*/

	
	io.restassured.response.Response res =given()
	.contentType("ContentType.JSON")
	
	.when()
	.get("http://localhost:3000/students");
	
	Assert.assertEquals(res.getStatusCode(),200);
	

String locationn = res.jsonPath().get("students[1].location").toString();

Assert.assertEquals(locationn,"US");
}
	
}