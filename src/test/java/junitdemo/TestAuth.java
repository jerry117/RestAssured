package junitdemo;


import io.restassured.RestAssured;
import io.restassured.config.SessionConfig;
import io.restassured.filter.session.SessionFilter;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestAuth {
    @BeforeClass
    public static void setup(){
          useRelaxedHTTPSValidation();
//        RestAssured.proxy("192.168.163.3", 8081);
    }




    @Test
    public void testAuthBasic(){
        given().auth().basic("hogwarts", "123456")
                .when().get("http://192.168.163.3:9002/baidu.html").prettyPeek()
                .then().statusCode(200);
    }

    @Test
    public void testJenkinsLogin(){

        RestAssured.config  = RestAssured.config().sessionConfig(
                new SessionConfig().sessionIdName("JSESSIONID"));

        SessionFilter sessionFilter = new SessionFilter();

        given()
                .filter(sessionFilter)
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

        given()
//                .sessionId("79BFCA8B54B0EF17761CD7753DA2B327")
                .filter(sessionFilter)
        .when()
                .log().all()
                .get("http://192.168.163.3:8080/jenkins/").prettyPeek()
        .then()
                .statusCode(200);

    }


    @Test
    public void testAuth2(){
        String token = "xxx";
        given().auth().oauth2(token)
        .when()
                .get("https://api.github.com/user")
                .prettyPeek()
        .then().statusCode(200);
    }

}
