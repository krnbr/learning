package in.neuw.learning.java8.interfaces;

/**
 * Created by Karanbir Singh on 7/3/2017.
 **/
public interface A {

    static void AB(){
        System.out.println("FROM INTERFACE A");
    }

    default void ABD(){
        System.out.println("FROM INTERFACE A ABD");
    }

}
