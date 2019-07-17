package APITesting.APItestingwithTestNG;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Put_request {
	@Test
	void egistrationSuccessful() {
		//Specify base URI
		 RestAssured.baseURI="https://reqres.in/";
		 
		//Request object
		 RequestSpecification httpRequest=RestAssured.given();
		 
		//Request paylaod sending along with post request
		 JSONObject Requestparams=new JSONObject ();
		 Requestparams.put("id","2");
		 Requestparams.put("first_name","Janet");
		 Requestparams.put("last_name","Weaver");
		 //Requestparams.put("Weaver","pppp");
		 Requestparams.put("email","chayanikamahapatra@gmail.com");
		 
		 
		 httpRequest.header("Content-Type","application/json");
		 
		 httpRequest.body(Requestparams.toJSONString());// attach above data to the request
		 
		 //Post request
		//Response object
		 Response response=httpRequest.request(Method.PUT,"/api/users/2");
		
		 //print response in console window
		 String responseBody=response.getBody().asString();
		  System.out.println("Response Body is:" +responseBody);
		
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("Status code is: "+statusCode);
		 // Assert.assertEquals(statusCode, 201);
		  
		//success code validation
		  String successCode=response.jsonPath().get("SuccessCode");
		 // Assert.assertEquals(successCode, "OPERATION_SUCCESS");
		  
	}

}
