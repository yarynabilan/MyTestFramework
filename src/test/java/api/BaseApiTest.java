package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;

public class BaseApiTest {
    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "https://api.novaposhta.ua/v2.0/json/";
    }
    public void setContentTypeJson() {
        RestAssured.given().contentType(ContentType.JSON);
    }
}


