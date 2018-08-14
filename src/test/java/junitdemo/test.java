package junitdemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.config.XmlConfig.xmlConfig;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class test {
    @BeforeTest
    public static void setup1(){
//        useRelaxedHTTPSValidation();
//        RestAssured.baseURI="http://www.baidu.com";
//        RestAssured.proxy("127.0.0.1",8080);

    }

//    @Test
//    public void function(){
//        System.out.println("function");
//    }
//
//    @Test(dependsOnMethods = {"function","function2"})
//    public void function1(){
//        System.out.println("function1");
//    }
//
//    @Test
//    public void function2(){
//        System.out.println("444");
//    }
//
//
//    @Test
//    public void jsonscheme(){
//
//        get("https://testerhome.com/api/v3/topics.json?limit=1&offset=0&type=last_actived").prettyPeek()
//                .then().assertThat().body(matchesJsonSchemaInClasspath("topics.json"));
//
//    }

    @Test
    public void testToString(){
        given()
                .when().log().all()
                .param("wd","kkkk")
                .get("/s").prettyPeek()
        .then().log().all();

    }

    @Test
    public void testlist(){
        given()
                .when()
                .get("http://localhost:9091/test.json").prettyPeek()
                .then().statusCode(200).body("", hasItems(1,2,3));//使用空字符串或者$符号去判断没有根节点的json格式。

    }


    @Test
    public void testxml(){
        given()
                .formParam("firstName", "John", "lastName", "Doe")

        .when()
                .get("http://localhost:9091/greet.xml").prettyPeek()
        .then().body("greeting.firstName", equalTo("{params(\"firstName\")}"), "greeting.lastName", equalTo("{params(\"lastName\")}"));
    }


    @Test
    public void testxml1(){

        given().
                config(RestAssured.config().xmlConfig(xmlConfig().declareNamespace("test", "http://localhost/"))).
                when().
                get("http://localhost:9091/test.xml").prettyPeek().
                then().
                body("foo.bar.text()", equalTo("sudo make me a sandwich!")).
                body(":foo.:bar.text()", equalTo("sudo "));
//                body("foo.test:bar.text()", equalTo("make me a sandwich!"));
    }

    @Test
    public void testerhome(){
        given()
                .log().all()
        .when()
                .get("https://testerhome.com")
        .then()
                .log().all()
                .statusCode(200)
                .body("html.head.title",equalTo("TesterHome"));
    }

    @Test
    public void testshippingxml(){

        Response response=given().log().all()
//                .proxy("")
                .when()
                .get("http://localhost:9091/shopping.xml").prettyPeek()
                .then()
                .body("shopping.category.find { it.@type == 'supplies' }.size()",equalTo(1))
                .time(lessThan(1000L))//校验时间
                .extract().response();

            int kd=response.path("shopping.category.find { it.@type == 'supplies' }.size()");
            assertEquals(kd,1);

    }
}




