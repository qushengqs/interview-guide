/**
 * 懒汉式 + synchronized
 * @Author: senne
 * @Date: 2019/9/2 17:16
 * @Version 1.0
 */
public class Singleton3 {
    private Singleton3(){

    }

    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance(){
        if (instance==null){
            instance=new Singleton3();
        }
        return instance;
    }
}
