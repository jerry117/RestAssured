public class Counter {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(count);
            count =count++;

        }
        System.out.println("count="+count);
    }
}
