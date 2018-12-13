public class TestFinalVariable {


    final int a = 5;
    final String str;
    final int c;
    final static double d;

    {
        str = "hello";
    }

    static {
        d = 5.6;
    }

    public  TestFinalVariable(){
//        str = "java";
        c = 6;
    }

    public void changeFinal(){
//        d = 1.3;
    }

    public static void main(String[] args) {
        TestFinalVariable tf = new TestFinalVariable();
        System.out.println(tf.a);
        System.out.println(tf.c);
        System.out.println(tf.d);
    }





}

