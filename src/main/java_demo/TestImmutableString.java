public class TestImmutableString {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");


        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
}

