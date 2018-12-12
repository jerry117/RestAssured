public class Wolf extends Animal {


    private Animal a;
    public Wolf(Animal a){
        this.a = a;


    }

    public void breath(){
        a.breath();
    }

    public void run(){

        System.out.println("run!");
    }

}
