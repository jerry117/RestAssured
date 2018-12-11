
public class Sub extends Base1 {

    public String color;
    public Sub(double size, String name, String color) {
        super(size, name);
        this.color =  color;

    }

    public static void main(String[] args) {
        Sub s = new Sub(3.5,"tewst","red");
        System.out.println(s.size+"--"+s.name+"--"+s.color);
    }




}
