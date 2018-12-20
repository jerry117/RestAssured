import java.util.ArrayList;
import java.util.List;

public class GenericList {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<String>();
        strList.add("sjdflj");
        strList.add("ajldkfjmv");
//        通过泛型控制输入的数据类型
//        strList.add(98);
        for (int i = 0; i < strList.size(); i++) {
            String str = strList.get(i);
        }
    }
}
