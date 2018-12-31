package in.neuw.learning.polymorphism.overload;

/**
 * Created by Karanbir Singh on 6/29/2017.
 **/
public class TestClass {

    private String test(){
        return "";
    }

    private String test(int i){
        return new String(i+"");
    }

    public String test(int i, String s) {
        return Integer.toString(i)+s;
    }

}
