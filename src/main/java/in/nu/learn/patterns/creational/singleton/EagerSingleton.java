package in.nu.learn.patterns.creational.singleton;

/**
 * Created by Karanbir Singh on 11/27/2018.
 **/
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        // called only once
        System.out.println("This class EagerSingleton initiated!!!");
    }

    public static EagerSingleton getInstance(){
        return instance;
    }

}
