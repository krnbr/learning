package in.neuw.learning.design.patterns.creational.singelton;

/**
 * Created by Karanbir Singh on 7/3/2017.
 **/
public class LazyInitializedSingletonMain {

    public static void main(String[] args) {
        LazyInitializedSingleton l1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton l2 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton l3 = LazyInitializedSingleton.getInstance();

        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(l3.hashCode());
    }

}
