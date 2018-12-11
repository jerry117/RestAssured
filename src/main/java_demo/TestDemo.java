public class TestDemo {


    private static boolean test(){
        int count = 3;
        String b = "aa";

        while (count>2){

            System.out.println(b);
//            count--;
            --count;
            System.out.println(count);
        }
        return count == 0? false : true;
    }

    public static void main(String[]  args){

//        new TestDemo();
//        System.out.println(test());

//        byte a = 5;
//        a += 5;

//        System.out.println(a);


//        int count2 = 20;
//        do {
//            System.out.println(count2++);
//        }
//        while (count2<10);


        int temp = 0;
//        outer:
//        for (int j = 0; j < 3; j++) {
//
//            for (int i = 0; i <10 ; i++) {
//
////                System.out.println(i);
//                temp = i;
//                if (temp>5)
//                {
////                    break outer;
//                    continue outer ;
////                    return;
//                }
////                System.out.println("continus");
//
//            }
//
//        }

//        System.out.println("over"+temp);

//        静态初始化，指定数组元素的初始值，不指定数组长度
        int[] intArr;
        intArr = new int[]{3,4,2,5};
        for (int i = 0; i < intArr.length ; i++) {
            System.out.println(intArr[i]);
        }

//        静态初始化，初始化数组元素的类型是定义的数组元素类型的子类
        Object[] objArr,objArr2;
        objArr = new String[]{"java","test","非洲"};
        System.out.println(objArr[2]);


        objArr2 = new Object[]{"java","demo","巴士"};
        Object[] objArr3 = {"java","demo","巴士","kajf"};
        System.out.println(objArr2[2]);
        System.out.println(objArr3[3]);

//        动态初始化数组

        int[] prices = new int[5];

        prices[0] = 8;
        prices[1] = 34;
        prices[2] = 23;
        prices[3] = 12;

//        System.out.println(prices[0]);
//        System.out.println(prices[4]);


        for (int price:prices
             ) {

            price = 67;
            System.out.println(price);
        }

        System.out.println(prices[1]);

        int []  a= {1,3,5};
        int []  b= new int[4];

        System.out.println("b数组的长度为："+b.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
        b = a;
        System.out.println("b数组的长度为："+b.length);

        int[] iArr;

        iArr = new int[5];

        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = i + 10;

        }

        for (int ia:iArr
             ) {
            System.out.println(ia);

        }


    }

}
