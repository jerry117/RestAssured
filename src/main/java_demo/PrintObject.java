public class PrintObject {
    private String name;
    public PrintObject(String name){
        this.name = name;

    }
    public void info(){
        System.out.println("name="+name);
    }

    public static void main(String[] args) {
        PrintObject p = new PrintObject("jaklfj");
        System.out.println(p.toString());
//        p.info();
    }

}
