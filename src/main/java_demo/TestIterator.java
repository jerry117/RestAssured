import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("ajfl");
        books.add("alfdjkl");
        books.add("sgasfd");
        Iterator it = books.iterator();
        while (it.hasNext()){

            String book = (String) it.next();

            System.out.println(book);
            if (book.equals("alfdjkl")){
                it.remove();

//                books.remove(book);
            }
            book = "test ajfdj";

        }
        System.out.println(books);
    }
}
