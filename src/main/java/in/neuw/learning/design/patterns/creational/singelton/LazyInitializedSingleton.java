package in.neuw.learning.design.patterns.creational.singelton;

/**
 * Created by Karanbir Singh on 7/3/2017.
 **/
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
