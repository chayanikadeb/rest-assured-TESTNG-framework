package APITesting.APItestingwithTestNG;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete_request {
	@Test
	void Deleaterequest() {
		//Specify base URI
		 RestAssured.baseURI="https://reqres.in/";
		 
		//Request object
		 RequestSpecification httpRequest=RestAssured.given();
		
		 
		 //Post request
		//Response object
		 Response response=httpRequest.request(Method.DELETE,"/api/users/2");
		
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		 // Assert.assertEquals(statusCode, 201);
		
	}

}
