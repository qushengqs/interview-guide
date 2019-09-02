/**
 * 双重检查锁
 *
 * @Author: senne
 * @Date: 2019/9/2 17:18
 * @Version 1.0
 */
public class Singleton4 {
    private Singleton4() {

    }

    private static volatile Singleton4 instance;

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
