package in.nu.learn.patterns.creational.singleton;

/**
 * Created by Karanbir Singh on 11/27/2018.
 **/
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}
