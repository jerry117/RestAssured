
import java.util.Arrays;

public class TestArrays {


    public static void main(String[] args) {
        int[] a = new int[]{3,4,5,6,7};
        int[] a2 = new int[]{3,4,5,6,7};
        System.out.println("数组是否相等："+Arrays.equals(a,a2));

        int[] b = Arrays.copyOf(a,6);
        System.out.println("数组是否相等"+Arrays.equals(a,b));
        System.out.println("b数组的元素为"+Arrays.toString(b));

        Arrays.fill(b,2,4,1);
        System.out.println("b数组的元素为"+Arrays.toString(b));
        Arrays.sort(b);

        System.out.println("b数组的元素为"+Arrays.toString(b));

    }
}
