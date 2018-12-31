package in.nu.learn.patterns.creational.singleton;

/**
 * Created by Karanbir Singh on 12/4/2018.
 **/
public class Runner {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        StaticSingleton staticSingleton1 = StaticSingleton.getInstance();

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        StaticSingleton staticSingleton2 = StaticSingleton.getInstance();

        System.out.println(eagerSingleton1.equals(eagerSingleton2));
        System.out.println(lazySingleton1.equals(lazySingleton2));
        System.out.println(staticSingleton1.equals(staticSingleton2));
    }

}
