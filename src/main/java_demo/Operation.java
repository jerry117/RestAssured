public enum Operation {
    PLUS,MINUS,TIMES,DIVIDE,KK;
    double eval(double x, double y){
        switch (this)
        {
            case PLUS:return x+y;
            case MINUS:return x-y;
            case TIMES:return x*y;
            case DIVIDE:return x/y;
            default:return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Operation.PLUS.eval(3,5));
        System.out.println(Operation.MINUS.eval(3,5));
        System.out.println(Operation.TIMES.eval(3,5));
        System.out.println(Operation.DIVIDE.eval(7,5));
        System.out.println(Operation.KK.eval(7,5));
    }
}
