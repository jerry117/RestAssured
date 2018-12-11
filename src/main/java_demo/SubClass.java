public class SubClass extends BaseClass {

    public String book = "sjlfajf";
    public void test(){
        System.out.println("子类覆盖父类的方法");
    }

    public void sub(){
        System.out.println("子类普通方法");
    }

    public static void main(String[] args) {
        BaseClass bc = new BaseClass();
        System.out.println(bc.book);

        bc.test();
        bc.base();


        SubClass sc = new SubClass();

        System.out.println(sc.book);

        sc.base();
        sc.test();


//        编译时类型是BaseClass,运行时类型是SubClass
        BaseClass ploymophicBc = new SubClass();

        System.out.println(ploymophicBc.book);

        ploymophicBc.base();
        ploymophicBc.test();


//        多态，需要强转才能编译通过。
//        ploymophicBc.sub();

//        ((SubClass) ploymophicBc).sub();


    }


}
