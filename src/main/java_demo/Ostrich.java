public class Ostrich extends Bird {



    public  void fly() {
        System.out.println("run");
    }

    public static void test(){
        System.out.println("test1");
    }

    public  void callOverridedMethod(){
        super.fly();
    }

    public static void main(String[] args) {
        Ostrich  os = new Ostrich();
        os.callOverridedMethod();
        os.test();
        os.fly();
    }
}
