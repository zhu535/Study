package Neuedu_20191223_单例模式;

/**
 * 饿汉式：在类装载的时候就完成实例化
 */
public class Singleton1 {

    private static Singleton1 singleton1 = new Singleton1();

    public Singleton1() {
    }

    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}
