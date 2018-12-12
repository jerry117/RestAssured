
public class TestInherit {

    public static void main(String[] args) {


//        继承的写法，继承表达的“是”的关系。狼是动物
//        Bird b = new Bird();
//        b.breath();
//        b.fly();
//        Wolf w = new Wolf();
//        w.breath();
//        w.run();



//        复用的写法，组合表达的是“有”的关系。人由手臂组成
//        显式创建被嵌套对象
        Animal a1 = new Animal();
        Bird b = new Bird(a1);
        b.breath();
        b.fly();
        //        显式创建被嵌套对象
        Animal a2 = new Animal();
        Wolf w = new Wolf(a2);
        w.breath();
        w.run();

    }

}
