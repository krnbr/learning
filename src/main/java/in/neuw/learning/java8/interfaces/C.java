package in.neuw.learning.java8.interfaces;

/**
 * Created by Karanbir Singh on 7/3/2017.
 **/
public class C implements A, B{

    @Override
    public void ABD() {
        A.AB();
    }

    public static void main(String[] args) {
        C c = new C();
        c.ABD();
    }

}
