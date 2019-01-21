package in.neuw.learning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * Created by Karanbir Singh on 1/6/2019.
 **/
public class cert {

    private String s1;
    private boolean b1;

    public static void main(String[] args) {

        cert c = new cert();

        System.out.println(c.s1+""+c.b1);

        try {
            int[] x = new int[10];
            System.out.println(x[11]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("123");
        }

        //int[] y = new int[-2];
        //java.lang.NegativeArraySizeException: -2

        int sum = 0;
        int k = 0;
        for(int j = 0;j<=10;j++){
            sum += j; k=j;}

        System.out.println(k);
        System.out.println(sum);

        Double d = Double.valueOf("120D");
        System.out.println(d);

        /*for (;;){

        }*/

        String s = "A";

        switch (s){
            case "a":
                System.out.println(s);
            default:
                System.out.println("def");
            case "A":
                System.out.println(s);
        }

        //System.out.println(Integer.valueOf("801.1")); //NumberFormatException

        StringBuilder stringBuilder = new StringBuilder("A");
        stringBuilder.append("-B");
        System.out.println(stringBuilder);

        System.out.println(LocalDateTime.now());

        LocalDate ld = LocalDate.of(2019, 2, 16);
        Period p = Period.ofDays(1);
        System.out.println(ld.plus(p));

    }
    //default void test(){}

}

interface Dumm{
    int x = 2;
    default int test(){
        return x;
    }
}
