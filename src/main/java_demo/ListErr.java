import java.util.ArrayList;
import java.util.List;

public class ListErr {
    public static void main(String[] args) {
        List strList = new ArrayList();
        strList.add("ajflj");
        strList.add("adf");
        strList.add("agssdfa");
        strList.add(5);
        for (int i = 0; i < strList.size() ; i++) {
            String str =(String) strList.get(i);

        }
    }
}
