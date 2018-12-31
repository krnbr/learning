package in.neuw.learning.innerclass.anonymous;

/**
 * Created by Karanbir Singh on 7/5/2017.
 **/
public class Main {

    public static void main(String[] args) {

        A a = new A(){
            public void show(){
                System.out.println("nothing new");
            }
        };
        a.show();

    }

}
