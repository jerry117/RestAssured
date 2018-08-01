package junitdemo;


import io.restassured.RestAssured;
import io.restassured.config.SessionConfig;
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

    @Test
    public void testJenkinsLogin(){

        RestAssured.config().sessionConfig(
                new SessionConfig().sessionIdName(" JSESSIONID"));

        given()
                .queryParam("Submit","%E7%99%BB%E5%BD%95")
                .queryParam("j_username","ll")
                .queryParam("j_password","ll")
                .queryParam("from","%2Fjenkins%2F")
        .when()
                .log().all()
                .post("http://192.168.163.3:8080/jenkins/j_acegi_security_check").prettyPeek()
        .then()
                .log().all()
                .statusCode(302);

    }



}
