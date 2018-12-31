package in.neuw.learning.polymorphism.override;

import java.io.IOException;

/**
 * Created by Karanbir Singh on 6/29/2017.
 **/
public class Child extends Parent{

    public void test(){

    }

    protected String testS(String s){
        return s;
    }

    int test(int i){
        return i;
    }

    String test(String s){return s;}

    String test(Long l){return Long.toString(l);}

    Long testI(int i) throws IOException{
        return new Long(i);
    }

    Long testL(int i) throws IOException{
        return Long.valueOf(i);
    }

}
