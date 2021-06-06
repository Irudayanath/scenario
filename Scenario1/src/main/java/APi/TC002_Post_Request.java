package APi;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.util.JSONPObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_Post_Request {
String key="2eaa241320ed625a766a43efc5b07e78";
	

    
   @Test

	
	public void Register()
	{
	RestAssured.baseURI="http://api.openweathermap.org/data/3.0/stations/2eaa241320ed625a766a43efc5b07e78";
	RequestSpecification httpreq=RestAssured.given();


	
	JSONObject resquestparam=new JSONObject();
	
	
	resquestparam.put("external_id:","DEMO_TESTING01");
	resquestparam.put("name Interview Station <Random Number>",777);
	resquestparam.put("latitude",33.33);
	resquestparam.put("longitude",-111.43);
	resquestparam.put("altitude",444);
	
	resquestparam.put("external_id:","DEMO_TEST00");
	resquestparam.put("name Interview Station <Random Number>",777);
	resquestparam.put("latitude",33.33);
	resquestparam.put("longitude",-1.43);
	resquestparam.put("altitude",444);
	
	given().
	body(resquestparam.toJSONString()).
	when().
	post("https://api.openweathermap.org/data/3.0/stations").
	thne().statuscode(201);
	
	
	
	httpreq.header("Content-Type","application/json");
	httpreq.body(resquestparam.toJSONString());
	
	Response res=httpreq.request("Method.POST","/stations");

	 String ress=res.getBody().asString();
	 //System.out.println("Response body is: " + responsebody);
	 int statuscode=res.getStatusCode();
	 System.out.println("Statuscode"+statuscode);
	 Assert.assertEquals(statuscode,201);
	 
	String statusline=res.getStatusLine();
	System.out.print("Statusline:"+statusline);

	AssertJUnit.assertEquals(statusline,"HTTP/1.1 400 Bad Request");
	
String Successcode=res.jsonPath().getString("Successcode");
System.out.println("Successoce: "+Successcode);


}
}