package in.neuw.learning.stringclass;

/**
 * Created by Karanbir Singh on 10/29/2018.
 **/
public class Main {

    public static void main(String[] args) {
        /*String s1= "Test";
        String s2= "Test";
        String s3 = new String("Test");
        String s4 = "Test";
        String s5 = s4;
        String s6 = new String(s5);
        String s7 = s6;
        String st = "st";

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s5==s4);
        System.out.println(s5==s6);
        System.out.println(s7==s6);
        System.out.println(s1=="Test");

        System.out.println(s6.intern() == s7);*/

        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        final String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));

    }

}
