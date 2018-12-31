package in.neuw.learning;

/**
 * Created by Karanbir Singh on 7/9/2017.
 **/
public class Whiz {

    static int i = 9;

    {
        System.out.print("Whiz ");
    };

    /*public static void main(String[] args) {
        System.out.print("Main ");

        int i = 8;
        for (; i>-1 ; i--);
            System.out.print(i);
    }*/

    static {
        System.out.print("Static ");
        int i = 1_10_00;
        boolean b = true;
        long l = 10_00L;
        double d = 0_9.4_2;
    }

    public static void main(String[] args) {
        System.out.println(new Integer("20")+Integer.valueOf("30")+Integer.decode("10"));
        final int x;
        x = 0;
        double d = 1.1;
        Boolean b = new Boolean("false");
        System.out.println(d+x);

        System.out.println("-----------------");
        short s = 10;
        s += 10;
        s++;
        s++;
        System.out.println(s);

        int k;
        System.out.println();

    }

}
