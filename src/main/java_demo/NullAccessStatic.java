public class NullAccessStatic {
    private static void test(){
        System.out.println("静态方法");
    }
//null对象可以访问所属类的类成员
    public static void main(String[] args) {
        NullAccessStatic nas = null;
        nas.test();
    }
}

