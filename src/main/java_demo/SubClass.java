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


//        ploymophicBc只能调用BaseClass里的方法
        BaseClass ploymophicBc = new SubClass();



//        多态只是针对方法，属性还是走的BaseClass的属性。
//        系统总是试图访问编译时类所定义的属性，而不是运行时类所定义的属性。
        System.out.println(ploymophicBc.book);


        ploymophicBc.base();
        ploymophicBc.test();


//        多态，需要强转才能编译通过。
//        ploymophicBc.sub();


//        判断能否转换，保证健壮性。
        if (ploymophicBc instanceof SubClass){
            SubClass pp = (SubClass)ploymophicBc;
            pp.sub();
        }

    }

}
