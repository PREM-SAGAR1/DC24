package day2;

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
/*
 * Different ways to create POST request body
 * 1)Post request body using Hashmap
 * 2)Post request body creation suing Org.JSon
 * 3)Post request Body creation usind POJO class
 * 4)Post request using external json file data
 *   
 */
public class WaystoCreatePostRequests 
{
	// * 1)Post request body using Hashmap
	
	//@Test (priority=1)
	void testPostusinHashMap()
	{
		HashMap data = new HashMap();
		
		data.put("name","scott");
		data.put("location","France");
		data.put("phone","123456");
		
	   String	courseArr[]= {"C","c++"};
	   
	   data.put("courses",courseArr);
	   
	   
	   given()
	     .contentType("application/json")
	     .body(data)
	     
	   .when()
	      .post("http://localhost:3000/students")
	   
	   .then()
	       .statusCode(201)
	       .body("name",equalTo("scott"))
	       .body("location",equalTo("France"))
	       .body("phone",equalTo("123456"))
	       .body("courses[1]",equalTo("c++"))
	       .body("courses[0]",equalTo("C"))
	       .header("Content-Type","application/json; charset=utf-8")
	       .log().all();

	       
	}
	
	// * 1)Post request body using json library
	
			//@Test (priority=1)
			void testPostusingJsonLibrary()
			{
				JSONObject data = new JSONObject();
				
				data.put("name","Scott");
				data.put("location","France");
				data.put("phone","123456");
				
				String coursesArr[] = {"C","C++"};
				
				data.put("courses",coursesArr);
			   
			   given()
			     .contentType("application/json")
			     .body(data.toString())
			     
			   .when()
			      .post("http://localhost:3000/students")
			   
			   .then()
			       .statusCode(201)
			       .body("name",equalTo("Scott"))
			       .body("location",equalTo("France"))
			       .body("phone",equalTo("123456"))
			       .body("courses[1]",equalTo("C++"))
			       .body("courses[0]",equalTo("C"))
			       .header("Content-Type","application/json; charset=utf-8")
			       .log().all();

			       
			}
			
	
	
	
	// * 1)Post request body using pojo
	
				//@Test (priority=1)
				void testPostusingPOJO()				
				{
					POJO_request data = new POJO_request();
					
                     data.setName("Scott");
                     data.setLocation("France");
                     data.setPhone("123456");

				   String coursesArr[] = {"C","C++"};
				   
				   data.setCourses(coursesArr);
				   
				   given()
				     .contentType("application/json")
				     .body(data)
				     
				   .when()
				      .post("http://localhost:3000/students")
				   
				   .then()
				       .statusCode(201)
				       .body("name",equalTo("Scott"))
				       .body("location",equalTo("France"))
				       .body("phone",equalTo("123456"))
				       .body("courses[1]",equalTo("C++"))
				       .body("courses[0]",equalTo("C"))
				       .header("Content-Type","application/json; charset=utf-8")
				       .log().all();

				       
				}
				
				
				
				// * 4)Post request body using external Json FILE
				
				@Test (priority=1)
				void  TESTPostexternalJsonFILE() throws Exception				
				{
					
					
					File f = new File(".\\body.json");
					
					FileReader fr = new FileReader(f);
					
					JSONTokener jt = new JSONTokener(fr);
					
					JSONObject data = new JSONObject(jt);
				   
				   given()
				     .contentType("application/json")
				     .body(data.toString())
				     
				   .when()
				      .post("http://localhost:3000/students")
				   
				   .then()
				       .statusCode(201)
				       .body("name",equalTo("Scott"))
				       .body("location",equalTo("France"))
				       .body("phone",equalTo("123456"))
				       .body("courses[1]",equalTo("C++"))
				       .body("courses[0]",equalTo("C"))
				       .header("Content-Type","application/json; charset=utf-8")
				       .log().all();

				       
				}
				
		
		@Test(priority=2)
		void testDelete()
		{
			given()
			
			.when()
			 .delete("http://localhost:3000/students/4")
			 
			 .then()
			 .statusCode(200);
		}
		
	
	
	
		
		


	
}
