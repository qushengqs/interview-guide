/**
 * 饿汉式
 *
 * @Author: senne
 * @Date: 2019/9/2 17:03
 * @Version 1.0
 */
public class Singleton1 {
    private Singleton1() {
    }

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }
}
