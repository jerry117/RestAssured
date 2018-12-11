public class Varargs {

//可变参数
    public static void test(int a, String... books){

        for (String tmp:books
             ) {
            System.out.println(tmp);

        }
        System.out.println(a);

    }


    public static void main(String[] args) {

        Varargs kkk = new Varargs();
        kkk.test(5,"ajfl","afljwefj","gwiogo");

    }
}
