public class Bird extends Animal {

    public  void fly(){
        System.out.println("fly!");
    }

    private void test(){
        System.out.println("test");
    }



    private Animal a;
    public  Bird(Animal a){
        this.a = a;

    }

//    定义自己一个breath方法
    public void breath(){
//        直接复用ananimal的breath方法
        a.breath();

    }

}
