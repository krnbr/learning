package in.neuw.learning.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Karanbir Singh on 1/19/2019.
 **/
public class Runner {

    public static void main(String[] args) {
        String[] testArgs = new String[]{"test","123","456"};
        Arrays.asList(testArgs).forEach(Runner::main);

        Consumer<String>         lambda1 = s -> {};
        Function<String, String> lambda2 = s -> s;

        Consumer<String>         lambda3 = Runner::main; // but s -> s doesn't work!
        Function<String, String> lambda4 = Runner::main;
    }

    public static String main(String s) {
        System.out.println(s);
        return s;
    }

}
