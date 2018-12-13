public class Singleton {

//    使用一个变量缓存曾经创建的实例
    private static Singleton instance;
//    将构造器使用private隐藏
    private Singleton(){}
//    提供一个静态方法，用于返回singleton实例
//    加入自定义的控制，保证只产生一个singleton对象
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
