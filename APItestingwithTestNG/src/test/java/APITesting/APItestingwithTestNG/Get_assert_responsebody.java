package APITesting.APItestingwithTestNG;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Get_assert_responsebody {
	private static final Object True = null;

	@Test
	void getweatherdetails() {
		//Specify base URI
		 RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		 
		//Request object
		 RequestSpecification httpRequest=RestAssured.given();
		 
		//Response object
		 Response response=httpRequest.request(Method.GET,"/Delhi");
		
		// print response in console window
		 String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		  Assert.assertEquals(responseBody.contains("Delhi"),true);// Validataing assert response 
		
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 200);
		  
		
	}
}
