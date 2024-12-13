package day1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.Assert;
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
import io.restassured.response.Response;

public class HTTPrequests2 
{

	// @Test
	 public void test_getAllVideoGames()
	 {
		 given()
		 
		 .when()
		    .get("scsdffds")
		 .then()
		   .statusCode(200);
		 
	 }
	
	 @Test
	 public void test_addNewVideoGame()
	 {
		 HashMap data = new HashMap();
		 
		 data.put("id","100");
		 data.put("name","Spider-Man");
		 data.put("releaseDate","20000");
		 data.put("reviewScore","S");

		 data.put("category","Adventure");

		 data.put("rating","Universal");	
		 
		 Response res =
				 
				 
		 given()
		    .contentType("application/json")
		       .body(data)
		        .when()
		          .post("http://locacl/aaap")
		 
		   .then()
		      .statusCode(200)
		      .log().body()
		      .extract().response();
		 
		 String jsonString=res.asString();
		 
		 Assert.assertEquals(jsonString.contains("Record added succsfuly"),true);
		          
		 
		 
		 
		 
	 }
	 
	 
	
	 
	 
	 @Test
	 
	 public void test_UpdateVideoGame()
	 {
	 HashMap data = new HashMap();
	 
	 data.put("id","100");
	 data.put("name","Spider-Man");
	 data.put("releaseDate","20000");
	 data.put("reviewScore","S");

	 data.put("category","Adventure");

	 data.put("rating","Universal");
	 
	 given()
	     .contentType("application/json")
	     .body(data)
	  .when()
	      .put("fsadfsdf")
	 .then()
	   .statusCode(200)
	   .log().body()
	   .body("videoGame,id", equalTo("100"))
	   .body("VideoGame.name", equalTo("Pacman"));
	   
	    
	 }
	 
	 
	 
}