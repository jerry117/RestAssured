package junitdemo;

import com.google.common.base.Utf8;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TesterHomeTest {
    @BeforeClass
    public static void setup(){
        useRelaxedHTTPSValidation();
//        RestAssured.baseURI="https:www.baidu.com";
//        RestAssured.proxy("127.0.0.1",8080);

    }

    @Test
    public void testHtml(){

        given()
                .queryParam("q","appium")
                .when()
                .get("https://testerhome.com/search").prettyPeek()
                .then()
                        .statusCode(200)
                        .body("html.head.title", equalTo("appium · 搜索结果 · TesterHome"));

    }
//    @Test
//    public void testTesterHomeJson(){
//        given()
//                .when().get("https://testerhome.com/api/v3/topics.json").prettyPeek().then()
//                .statusCode(200)
//                .body("topics.title", hasItem("杭州移动测试开发课程线下班_霍格沃兹测试学院"))
//                .body("topics.title", hasItems("号外号外，MTSC2018 开发大会议题继续征集！"))
//                .body("topics.id[-1]", equalTo(13263))
//                .body("topics.findAll { topic->topic.id == 11402}.title", hasItems("号外号外，MTSC2018 开发大会议题继续征集！"))
//                .body("topics.find { topic->topic.id == 11402}.title", equalTo("号外号外，MTSC2018 开发大会议题继续征集！"))
//
//        ;
//
//
//
//
//    }
    @Test
    public void testTesterHomeJsonSingle(){
        given().when().get("https://testerhome.com/api/v3/topics/10254.json").prettyPeek()
                .then()
                .statusCode(200)
                .body("topic.title", equalTo("优质招聘汇总"))
                ;



    }

//    @Test
//    public void testBanggoodSearch(){
//        useRelaxedHTTPSValidation();
//        given().when().get("https://gbeta24.banggood.com/?zmkm=1").prettyPeek().then()
//                .statusCode(200);
//
//    }

    @Test
    public void testBanggoodSolr(){
        useRelaxedHTTPSValidation();
        int i = 0;
        String url = "http://10.171.31.60:8986/solr/banggood/select?_=1524195907755&defType=edismax&df=text_all&q=products_id:1260985&q.op=and&qf=text_title%5E0.8++text_attribute%5E0.001" ;
        given().when().get(url).prettyPeek()
                .then().statusCode(200).body("response.numFound", equalTo(1));
        int a = i + 1;
        System.out.println(a);
    }


    @Test
    public void testTesterHomeSearch(){
        given().queryParam("q", "霍格沃兹测试学院").when().get("https://testerhome.com/search").prettyPeek()
                .then().statusCode(200);
    }


    @Test
    public void testXML(){
        given().when().get("http://101.132.159.87:8000/demo.xml").prettyPeek()
                .then().statusCode(200)
                .body("shopping.category.item.name[2]", equalTo("Paper"))
                .body("shopping.category[1].item[1].name", equalTo("Pens"))
                .body("shopping.category.size()", equalTo(3))
        ;

    }


}


