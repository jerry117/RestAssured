import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class TestConstructor {


    public String name;
    public int count;

    public TestConstructor(){

    }

    public TestConstructor(String name, int count){
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {


        TestConstructor tc1 =  new TestConstructor();
        TestConstructor tc =  new TestConstructor("sajflj", 6);
        System.out.println(tc1.name);
        System.out.println(tc.name);
        System.out.println(tc1.count);
        System.out.println(tc.count);
    }
}
