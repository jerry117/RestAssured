public class TestSingleton {

    public static void main(String[] args) {

//        对象不能通过构造器
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);

//        System.out.println(s1.equals(s2));


    }
}
