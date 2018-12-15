public class BetterPrinter implements Output {

    private String[] printData = new String[MAX_CACHE_LINE];

//    记录当前打印数
    private int dataNum = 0;

    public void out(){
        while (dataNum >0 ){
            System.out.println("高速打印"+printData[0]);
            System.arraycopy(printData,1,printData,0,--dataNum);
        }

    }

    @Override
    public void getData(String msg) {
        if (dataNum >= MAX_CACHE_LINE * 2){
            System.out.println("队列已满，添加失败");
        }
        else {
            printData[dataNum++] = msg;
        }
    }

}
