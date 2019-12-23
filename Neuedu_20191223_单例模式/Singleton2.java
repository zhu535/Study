package Neuedu_20191223_单例模式;

/**
 * 懒汉式：延迟加载，在使用到的时候才进行类的实例化
 */
public class Singleton2 {

    private static Singleton2 singleton2;

    public Singleton2() {
    }

    public static Singleton2 getSingleton2(){

        if(singleton2 == null){
            singleton2 = new Singleton2();
        }

        return singleton2;
    }
}
