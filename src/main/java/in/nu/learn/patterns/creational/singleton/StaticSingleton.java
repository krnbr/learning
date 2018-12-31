package in.nu.learn.patterns.creational.singleton;

/**
 * Created by Karanbir Singh on 11/27/2018.
 **/
public class StaticSingleton {

    private static StaticSingleton instance;

    private StaticSingleton() {}

    static {
        instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return instance;
    }

}