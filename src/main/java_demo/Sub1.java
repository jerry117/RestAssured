public class Sub1 extends Base {

    private String name;
    public void test(){
//        为了抛空指针
        System.out.println("子类重写父类方法，他的name长度："+name.length());
    }


    public static void main(String[] args) {


//        由于父类构造器调用了被子类重写的方法，则变成调用被子类重写后的方法。sub对象的name属性是null，因此有空指针异常。
        Sub1 s = new Sub1();
//        s.test();

    }


}
