package in.neuw.learning.design.patterns.creational.singelton;

/**
 * Created by Karanbir Singh on 7/2/2017.
 **/
public class EagerInitializedSingletonMain {

    public static void main(String[] args) {
        EagerInitializedSingleton e1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton e2 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton e3 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton e4 = EagerInitializedSingleton.getInstance();

        System.out.println(e1==e2);
        System.out.println(e1==e3);
        System.out.println(e1==e4);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
    }

}
