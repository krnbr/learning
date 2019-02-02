package in.neuw.learning;

/**
 * Created by Karanbir Singh on 1/22/2019.
 **/
public class UnderstandingPrimitives {

    public static void main(String[] args) {
        long l = 123123123123123123L;
        short s = 12345;
        byte b = 123;
        int i = 1231231231;
        int h = 0x1E;
        int o = 07;
        int bi = 0B1111;
        System.out.println(h);
        System.out.println(o);
        System.out.println(bi);
        System.out.println(Integer.toOctalString(123));
        System.out.println(Integer.toHexString(123));
        System.out.println(Integer.toBinaryString(123));
        System.out.println(0x7bb);


    }

}
