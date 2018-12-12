
public class TestInherit {

    public static void main(String[] args) {
//        Bird b = new Bird();
//        b.breath();
//        b.fly();
//        Wolf w = new Wolf();
//        w.breath();
//        w.run();

        Animal a1 = new Animal();
        Bird b = new Bird(a1);
        b.breath();
        b.fly();
        Animal a2 = new Animal();
        Wolf w = new Wolf(a2);
        w.breath();
        w.run();


    }


}
