package in.neuw.learning.java8.interfaces;

/**
 * Created by Karanbir Singh on 7/3/2017.
 **/
public interface B {

    static void AB(){
        System.out.println("FROM INTERFACE Bx");
    }

    default void ABD(){
        System.out.println("FROM INTERFACE B ABD");
    }

}
