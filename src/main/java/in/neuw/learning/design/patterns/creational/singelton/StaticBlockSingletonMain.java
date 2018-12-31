package in.neuw.learning.design.patterns.creational.singelton;

/**
 * Created by Karanbir Singh on 7/2/2017.
 **/
public class StaticBlockSingletonMain {

    public static void main(String[] args) {
        StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton s3 = StaticBlockSingleton.getInstance();

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }

    /*
        The Singleton Class's static block initialized
        The Singleton Class's object/instance initialized
        true
        true
        460141958
        460141958
        460141958
    */

}
