

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void test(List<?> c){
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }

    }

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("sifj");
        strList.add("wijsdfj");
        test(strList);
    }



}

