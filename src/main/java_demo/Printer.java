public class Printer implements Output, Product  {
    private String[] printData = new String[MAX_CACHE_LINE];
    private int dataNum = 0;
    public void out(){
        while (dataNum > 0){
            System.out.println("打印"+printData[0]);
            System.arraycopy(printData,1,printData,0, --dataNum);

        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum >= MAX_CACHE_LINE){
            System.out.println("队列已满，添加失败");
        }

        else
        {
            printData[dataNum++] = msg;
        }
    }

    public int getProductTime(){
        return 45;
    }


    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("jafdljlj");
        o.getData("alfjl");
        o.out();
        o.getData("azmzmv");
        o.getData("afjlmnv");
        o.out();
        Product p = new Printer();
        Printer p1 = new Printer();
        System.out.println(p.getProductTime());
        Object obj = p;

    }



}
