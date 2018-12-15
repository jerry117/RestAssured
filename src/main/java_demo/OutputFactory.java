public class OutputFactory {


//    接口类型的方法返回，返回一个output实现类的实例。
    public Output getOutput(){
//        return new BetterPrinter();
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("ajflj");
        c.keyIn("ajfiejg");
        c.print();
    }
}
