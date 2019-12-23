package Neuedu_20191223_单例模式;

/**
 * 双重加锁机制：
 */
public class Singleton3 {

    private static Singleton3 singleton3;

    public Singleton3() {
    }

    public static Singleton3 getSingleton3(){

        if(singleton3 == null){

            synchronized (Singleton3.class){

                if(singleton3 == null){

                    singleton3 = new Singleton3();
                }
            }
        }

        return singleton3;
    }
}
