import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        books.offer("end");
        books.push("kk");
        books.offerFirst("first");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
    }
}

