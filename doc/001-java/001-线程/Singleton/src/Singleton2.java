/**
 * 懒汉式
 *
 * @Author: senne
 * @Date: 2019/9/2 17:06
 * @Version 1.0
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }

        return instance;
    }
}
