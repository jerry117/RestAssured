public class TestPerson {


    public static void main(String[] args) {
        System.out.println("eye的类属性值："+Person.eyeNum);
        Person p = new Person();
        System.out.println(p.name+p.eyeNum);

        p.name = "kkk";
        p.eyeNum = 2;

        System.out.println(p.name+p.eyeNum);

        System.out.println("eye的类属性值："+Person.eyeNum);

        Person p1 = new Person();
        System.out.println(p1.eyeNum);


    }
}
