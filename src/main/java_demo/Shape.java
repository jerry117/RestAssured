public abstract  class Shape {


    {
        System.out.println("初始化");
    }

    private String color;

    public abstract double calPerimeter();

    public abstract String getType();

    public Shape(){}
    public Shape(String color){
        System.out.println("执行shape构造器");
        this.color = color;

    }

    public void setColor(String color){
        this.color = color;

    }

    public String getColor(){
        return this.color;
    }



}
