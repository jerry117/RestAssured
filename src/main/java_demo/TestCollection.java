import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("bb");
        c.add("7");
        System.out.println("aljflj"+c.size());
        c.remove("7");
        System.out.println("aljflj"+c.size());
        System.out.println("aflj"+c.contains("bb"));
        c.add("lajflj");
        System.out.println("ajkflj"+c);

    }
}
