public class Cow {

    private double weight;
    public Cow(){
    }
    public Cow(double weight){
        this.weight = weight;

    }
    private class CowLeg{
        private double length;
        private String color;

        public CowLeg(){}
        public CowLeg(double length, String color){
            this.length = length;
            this.color = color;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void info(){
            System.out.println("牛腿颜色"+color+", 高"+ length);
            System.out.println("奶牛重"+weight);
        }


    }

    public void test(){
        CowLeg cl = new CowLeg(1.25,"jalfjasf");
        cl.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(89.90);
        cow.test();
    }
}

