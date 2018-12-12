public class Primitive2Wrapper {

    public static void main(String[] args) {
//        包装类对象和基本类型变量的转换
        boolean bl = true;
        Boolean b1Obj = new Boolean(bl);

        boolean b2 = b1Obj.booleanValue();
        System.out.println(b2);

        int it = 5;
        Integer itObj = new Integer(it);
        int it1 = itObj.intValue();
        System.out.println(it1);

        Float f1 = new Float("4.33");
        float f2 = f1.floatValue();
        System.out.println(f2);

        Boolean bObj = new Boolean("false");

//        Long lObj = new Long("dd");
    }
}
