/**
 * 静态内部类
 * @Author: senne
 * @Date: 2019/9/2 17:22
 * @Version 1.0
 */
public class Singleton5 {
    private Singleton5(){}

    private static class InnerClass{
        private static Singleton5 instance=new Singleton5();
    }

    public static Singleton5 getInstance(){
        return InnerClass.instance;
    }
}
