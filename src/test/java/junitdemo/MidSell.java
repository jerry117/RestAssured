package junitdemo;

import io.restassured.RestAssured;
import io.restassured.config.SessionConfig;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class MidSell {

    @BeforeClass
    public static void setup() {
        useRelaxedHTTPSValidation();
//        RestAssured.baseURI="https:www.baidu.com";
//        RestAssured.proxy("127.0.0.1",8080);



    }
//    @Test
//    public  void testMidSellLogin(){
//        RestAssured.config().sessionConfig(new SessionConfig().sessionIdName("banggood_SID"));
//        given().
//
//    }


}
