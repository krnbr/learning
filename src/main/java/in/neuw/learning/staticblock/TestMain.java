package in.neuw.learning.staticblock;

/**
 * Created by Karanbir Singh on 7/3/2017.
 **/
public class TestMain {

    public static String s;

    {
        s = "123";// the value s is assigned 123
        System.out.println("This was initialized from the default/empty block");
    }

    static {
        s = "1234";// the value s is assigned 1234
        System.out.println("This was initialized from the static block");
    }

    static class InnerClass {
        InnerClass(){
            System.out.println("Inner Class Constructor");
        }
        static void test(){
            System.out.println("Test method inner class");
        }
        void test(String message){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
        TestMain testMain = new TestMain();
        System.out.println("testMain.s "+testMain.s);
        TestMain.InnerClass.test();
        TestMain.InnerClass innerClass = new TestMain.InnerClass();
        innerClass.test("Message from the main method");
        /*String [] sa = new String[]{"a","b"};
        main(sa);
        TestMain.main(sa);*/
    }

}
