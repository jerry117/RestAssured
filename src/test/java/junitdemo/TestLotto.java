package junitdemo;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.junit.*;

public class TestLotto {


    @Test
    public void Testlotto(){
        given().contentType("application/json").
                when().get("http://192.168.99.100/lotto.json").prettyPeek()
//               控制返回的type为json
                .then().statusCode(200).contentType(ContentType.JSON).time(lessThan(2000L));
    }

}
