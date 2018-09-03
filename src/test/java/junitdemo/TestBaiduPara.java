package junitdemo;


import com.google.common.base.Utf8;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



@RunWith(Parameterized.class)
public class TestBaiduPara {

//数据驱动case
//    @Parameterized.Parameters(name = "{index}: baidu search wd={0} expect={1}")
//    public static Collection<Object[]> data() {
//        return Arrays.asList(new Object[][] {
//                { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }
//        });
//    }
//
//
//
//
//    @Parameterized.Parameter // first data value (0) is default
//    public /* NOT private */ int fInput;
//
//    @Parameterized.Parameter(1)
//    public /* NOT private */ int fExpected;



//    @Test
//    public void baidu(){
//        given()
//                .log().all()
//                .queryParam("wd",fInput)
//            .when()
//                .get("http://www.baidu.com/s")
//            .then()
//                .log().all()
//                .statusCode(200)
//                .body("html.head.title",equalTo(fExpected+"_百度搜索"));
//    }



    @Parameterized.Parameters(name = "{0}vs{1}")
    public static Integer[][] data1(){
        return new Integer[][]{
                {0,0 },{1,1},{2,3}
        };
    }
    @Parameterized.Parameter
    public int first;
    @Parameterized.Parameter(1)
    public int second;

    @Test
    public void testDemo(){
        assertThat(first,equalTo(second));
    }

}
