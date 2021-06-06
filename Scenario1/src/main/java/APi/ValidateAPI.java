package APi;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ValidateAPI {
@Test
public void TestAPI()
{
RestAssured.baseURI="https://openweathermap.org/stations";
RequestSpecification httpreq=RestAssured.given();

Response response=httpreq.request(Method.GET,"/San Fransisco");

 String responsebody=response.getBody().asString();
 //System.out.println("Response body is: " + responsebody);
 int statuscode=response.getStatusCode();
 System.out.println("Statuscode"+statuscode);
 Assert.assertEquals(statuscode,404);
 
String statusline=response.getStatusLine();
System.out.print("Statusline:"+statusline);

Assert.assertEquals(statusline,"HTTP/1.1 404 Not Found");

}
}