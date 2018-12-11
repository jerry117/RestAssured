public class Overload {
    public void test(){
        System.out.println("wucanshu");
    }

    public void test(String msg){
        System.out.println("alfjslj"+msg);
    }

    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.test();
        ol.test("jsfjl");
    }
}
