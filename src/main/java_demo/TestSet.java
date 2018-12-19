import java.util.HashSet;
import java.util.Set;
import java.lang.String;


public class TestSet {
    public static void main(String[] args) {
        Set books = new HashSet();

        books.add(new String("ajflj"));
        boolean result = books.add(new String("aljfljalf"));
        System.out.println(books);
    }
}
