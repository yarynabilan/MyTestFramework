package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiTest extends BaseApiTest {

    String API_KEY = "1f4180cfc5ee6321779a492642cf7b6c";

    @Test
    public void testNovaPoshtaApi() {
        setContentTypeJson();

        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("apiKey", API_KEY);

        Response response = RestAssured.given()
                .body(requestBody)
                .post();

        int statusCode = response.getStatusCode();
        assertEquals(200, statusCode, "Status Code is not 200");

        String responseBody = response.getBody().asString();

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Body: " + responseBody);

    }
}


