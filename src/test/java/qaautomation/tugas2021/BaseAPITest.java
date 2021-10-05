package qaautomation.tugas2021;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import qaautimation.august2021.apis.APIEndpoints;
import qaautimation.august2021.apis.JsonPath;
import qaautomation.tugas2021.utility.APIUtility;
import qaautomation.tugas2021.utility.DataUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public abstract class BaseAPITest {
	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
			.setContentType(ContentType.JSON).build().log().all();
	RequestSpecification loginJsonSpec;
	
	@BeforeSuite
	public void testLoginAPI() {
		RestAssured.baseURI = "https://api-staging-builder.engineer.ai";
		//String payload = "{\"email\": \"jogidemo321@gmail.com\", \"password\": \"builder123\"}";
		String payload = DataUtility.getDataFromExcel("Payloads", "LoginPayload");
		//Response response = RestAssured.given().contentType("application/json").body(payload).when()
		//		.post("/users/sign_in");
		//Response response = given().spec(commonJsonSpec).body(payload).when().post("/users/sign_in");
		Response response = given().spec(commonJsonSpec).body(payload).when().post(APIEndpoints.login);
		assertEquals(response.statusCode(), 200);

		//String token = response.jsonPath().get("user.authtoken");
		//String token = APIUtility.getBodyDataUsingJsonPath(response, "user.authtoken");
		String token = APIUtility.getBodyDataUsingJsonPath(response, JsonPath.authToken);
		loginJsonSpec = new RequestSpecBuilder().setBaseUri("https://api-staging-builder.engineer.ai")
				.setContentType(ContentType.JSON).addHeader("authtoken", token).build().log().all();
		
	}
}
