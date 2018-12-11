package junitdemo;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.junit.Test;


public class test_m_sexy {


    @Test
    public void testscheme(){

        given().when()
                .get("https://mbeta.xxx.com/pwa/search/ajax_search/?zmkm=1&routeFlag=%2Fsex%2Fclit+vibrators%2F&api=%2Fsearch%2Fajax_search%2F&keywords=clit+vibrators&page=3&cat_id=&sort=&pfrom=&pto=&rating=&filter_value=&rid=").prettyPeek()
                .then().assertThat().body(matchesJsonSchemaInClasspath("sexy.json"))
                .statusCode(200);

    }



}
