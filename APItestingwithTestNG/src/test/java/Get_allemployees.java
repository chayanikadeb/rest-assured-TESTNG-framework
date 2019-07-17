import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import T1_basepackage.basefile_info;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Get_allemployees extends basefile_info{


@BeforeClass

void getallEmployees()throws InterruptedException{
	
	logger.info("*************Started Get_All_Employees*************");
	 RestAssured.baseURI=" http://dummy.restapiexample.com/api/v1";
	 RequestSpecification httpRequest=RestAssured.given();
	 Response response=httpRequest.request(Method.GET,"/employees");
	 
	 Thread.sleep(3000);
}

@Test

void checkResponseBody() throws InterruptedException {
logger.info("*************check Response Body*************");
String responseBody=response.getBody().asString();
//System.out.println("Response Body is:" +responseBody);
logger.info("Response Body is:" +responseBody);
Assert.assertTrue(responseBody!=null);
Thread.sleep(3000);	
}

@Test

void checkstatuscode() throws InterruptedException {
logger.info("*************check status code*************");
int statusCode=response.getStatusCode();
//System.out.println("Status code is: "+statusCode);
logger.info("Status code is: "+statusCode);
Assert.assertEquals(statusCode, 200);
Thread.sleep(3000);
}
}