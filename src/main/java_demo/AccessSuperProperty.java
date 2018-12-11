public class AccessSuperProperty extends BaseClass{


        public int a = 7;
        public void accessOwner(){
            System.out.println(a);
        }

        public void accessBase(){
            System.out.println(super.a);
        }
        public static void main(String[] args) {
            AccessSuperProperty sc = new AccessSuperProperty();
            sc.accessOwner();
            sc.accessBase();
        }


}


