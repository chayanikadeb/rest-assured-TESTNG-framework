package T1_basepackage;



import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class basefile_info {
 public static RequestSpecification httpRequest;
 
 public static Response response;
 public String empID="78999";
 
	public Logger logger;
	
	@BeforeClass 
	public void setup() {
		
	logger=Logger.getLogger(basefile_info.class);
	PropertyConfigurator.configure("Log4j.propeties");
	logger.setLevel(Level.DEBUG);
}
}