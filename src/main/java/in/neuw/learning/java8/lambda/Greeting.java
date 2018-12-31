package in.neuw.learning.java8.lambda;

/**
 * Created by Karanbir Singh on 11/13/2018.
 **/
public class Greeting {

    public static void main(String[] args) {
        LambdaFucntion greet = System.out::println;
        greet.foo();
        greet.foo();
        greet.foo();


    }

}

interface LambdaFucntion {

    void foo();

}