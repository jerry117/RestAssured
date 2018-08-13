package junitdemo;

import io.restassured.builder.ResponseBuilder;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.http.ContentType;
import  io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestSearchApi {

    @Test
    public void testSearchApi(){
        useRelaxedHTTPSValidation();
        given().log().all().filter(new Filter() {
            public Response filter(FilterableRequestSpecification requestSpec,
                                   FilterableResponseSpecification responseSpec,
                                   FilterContext ctx) {
                return new ResponseBuilder().clone(ctx.next(requestSpec, responseSpec))
                        .setHeader("Content-Type", ContentType.JSON.toString()).build();}
            })
                    .queryParam("m","search")
                    .queryParam("s","BGSearchService")
                    .queryParam("a","appProductList")
                    .queryParam("time","1527759578")
                    .queryParam("account","banggood")
                    .queryParam("lang","en-GB")
                    .queryParam("page","2")
                    .queryParam("pageSize","16")
                    .queryParam("keyWord","xiaomi")
                .when()
                    .get("https://searchapi_beta1.banggood.com/")
                .then()
                    .statusCode(200)
                    .body("code",equalTo(200));




    }

    @Test
    public void testhtml(){
        given().log().all().filter(new Filter() {
            public Response filter(FilterableRequestSpecification requestSpec,
                                   FilterableResponseSpecification responseSpec,
                                   FilterContext ctx) {
                return new ResponseBuilder().clone(ctx.next(requestSpec, responseSpec))
                        .setHeader("Content-Type", ContentType.JSON.toString()).build();
            }
        });
    }

    @Test
    public void testJson(){
         given().when().get("https://testerhome.com/api/v3/topics.json").prettyPeek().then()
                .statusCode(200);
    }
}
