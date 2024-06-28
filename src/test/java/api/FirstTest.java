package api;

import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.*;
import pojo.Data;
import pojo.Root;

import java.util.List;

import static io.restassured.RestAssured.given;

public class FirstTest {

    private static String requestBody = "{\"query\": \"та\"}";
    private static String token = "87abfabe53810e5ba94c0fe544da51fdf2bb04e1";

    String URL = "http://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/country";

    @Test
    public void test(){
        List<Root> root = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .header("Authorization", "Token " + token)
                .body(requestBody)
                .post(URL)
                .then().log().all()
                .extract().body().jsonPath().getList("suggestions", Root.class);
        root.forEach(x-> Assertions.assertTrue(x.getValue().contains("Та")));
        root.forEach(x-> Assertions.assertTrue(x.getData().getAlfa2().contains("T")));


        int i = 3;





//                .getBody()
//                .print();


    }
}
