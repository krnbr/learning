package in.neuw.learning.polymorphism.override;

import java.io.IOException;

/**
 * Created by Karanbir Singh on 6/29/2017.
 **/
public class Parent {

    protected void test(){

    }

    String testS(String s){
        return s;
    }

    int test(int i){
        return i;
    }

    Number testI(int i) throws Exception{
        return i;
    }

    Long testL(int i) throws IOException {
        return new Long(i);
    }

}
