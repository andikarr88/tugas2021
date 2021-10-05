package qaautomation.tugas2021;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;
import qaautimation.august2021.apis.APIEndpoints;
import qaautomation.tugas2021.utility.APIUtility;
import qaautomation.tugas2021.utility.DataUtility;


public class RestAssured extends BaseAPITest {
	
	@Test
	public void signupAPI() {
		Faker  faker = new Faker();
		String loginFailedPayload = DataUtility.getDataFromExcel("Payloads", "SignUp")
				.replace("$.email", faker.name().username() + "gmail.com").replace("$.first_name", "12344").replace("$.last_name", "12344").replace("$.password", "12344").replace("$.phone_number", "+6281572317993").replace("$.user_type", "User");
		Response response = given().spec(commonJsonSpec).body(loginFailedPayload).when().post(APIEndpoints.user);
		assertNotEquals(response.getStatusCode(), 200);
		assertEquals(response.getStatusCode(), 422);
	}
	

}
