package in.neuw.learning.design.patterns.creational.singelton;

/**
 * Created by Karanbir Singh on 7/2/2017.
 **/
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor makes the true sense for the
    private EagerInitializedSingleton(){
        System.out.println("The Singleton Class's object/instance initialized");
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
