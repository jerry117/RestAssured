

public class TestReferenceArray {

    public static void main(String[] args) {
        Person[] student;

        student = new Person[2];



        Person zhang = new Person();

        zhang.age = 14;
        zhang.height = 151;

        Person lee = new Person();

        lee.age = 16;
        lee.height = 161;


        student[0] = zhang;
        student[1] = lee;

        lee.info();
        student[1].info();



        int[][] a;
        a = new int[3][];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        a[0] = new int[2];

        a[0][1] = 6;
        for (int i = 0; i < a[0].length; i++) {
            System.out.println(a[0][i]);
        }

    }
}
