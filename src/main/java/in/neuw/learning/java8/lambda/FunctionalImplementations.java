package in.neuw.learning.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Karanbir Singh on 12/16/2018.
 **/
public interface FunctionalImplementations {

    // currying
    Function<String, Function<Character, Number>> numberOfCharacters = s -> c -> s.chars().filter(num -> num == c).count();

    BiFunction<String, Character, Long> numberOfChars = (s,c) -> s.chars().filter(num -> num == c).count();

    // currying
    Function<String, Function<String, Function<Character, String>>> concatTest = s1 -> s2 -> c -> s1+c.toString()+s2;

}