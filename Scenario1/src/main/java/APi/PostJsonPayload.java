package APi;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostJsonPayload {
	private static String payload = "{\n" +
	        "  \"description\": \"Some Description\",\n" +
	        "  \"id\": \"Some id\",\n" +
	        "  \"name\": \"Some name\"\n" +
	        "}";
	    @Test
	    public static Response postJsonPayload() {
	        return
	            given().
	            contentType(ContentType.JSON)
	            .body(payload)
	            .post("/some/resource")
	            .then()
	            .statusCode(200)
	            .extract()
	            .response();
	    }
}
