package junitdemo;

import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class test3 {

//    @Test
//    public  void gettest(){

//        get("http://www.baidu.com").prettyPeek();
//
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("limit", 2);
//        map.put("offset", "0");
//        map.put("type", "last_actived");
//
//        given().params(map).get("https://testerhome.com/api/v3/topics.json").prettyPeek();



//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("user[login]", "test@qq.com");
//        map.put("ser[password]", "111111");
//        map.put("user[remember_me]", "0");
//
//
//        given().params(map).post("https://testerhome.com/account/sign_in").prettyPeek();



//          given().cookie().get().prettyPeek();
//          given().header().get().prettyPeek();
//          given().urlEncodingEnabled(ture).params().post().prettyPeek();
//    }

    @Test
    public void jsonpathtest(){
        Response response = get("https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived");
        List<Object> list = response.jsonPath().getList("topics");

        System.out.println(list.size());
        System.out.println(response.jsonPath().getString("topics[0].id"));

    }

            public static void main(String[] args){

    }
}
