import java.util.HashSet;

class A1{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class B{
    @Override
    public int hashCode() {
        return 1;
    }
}

class C{
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class TestHashSet {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new A1());
        books.add(new A1());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }
}
