package junitdemo;


import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestAuth {
    @BeforeClass
    public static void setup(){
        RestAssured.proxy("192.168.163.3", 8081);
    }

    @Test
    public void testAuthBasic(){
        given().auth().basic("hogwarts", "123456")
                .when().get("http://192.168.163.3:9002/baidu.html").prettyPeek()
                .then().statusCode(200);
    }



}
