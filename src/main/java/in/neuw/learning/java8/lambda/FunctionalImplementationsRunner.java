package in.neuw.learning.java8.lambda;

import java.util.ArrayList;

public class FunctionalImplementationsRunner {

    public static void main(String[] args) {
        String test = "test";
        System.out.println(FunctionalImplementations.numberOfCharacters.apply(test).apply('t'));
        System.out.println("2nd test "+FunctionalImplementations.numberOfChars.apply(test,'t'));
        System.out.println(FunctionalImplementations.concatTest.apply("test").apply("test2").apply('c'));

        //var something = new ArrayList<String>();
    }

}