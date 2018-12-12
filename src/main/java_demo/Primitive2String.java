public class Primitive2String {


    public static void main(String[] args) {

//        字符串转对应的类型
        String intstr = "132";
        int it = Integer.parseInt(intstr);
        System.out.println(it);
        String floatstr = "34.443";
        float fl = Float.parseFloat(floatstr);
        System.out.println(fl);


        String ftStr = String.valueOf(3.2354f);
        System.out.println(ftStr);
//        判断是否是数字类型
        boolean isNum=ftStr.matches("[0-9]+");
        System.out.println(isNum);

    }

}
