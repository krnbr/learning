package in.neuw.learning.serialization;

import java.io.*;

/**
 * Created by Karanbir Singh on 7/1/2017.
 **/
public class MainSerClass {

    public static void main(String[] args) {

        SerClass s1 = new SerClass(1,"a");
        SerClass s2 = new SerClass(2,"b");

        try(
                FileOutputStream f = new FileOutputStream(new File("savedObjects.txt"));
                ObjectOutputStream o = new ObjectOutputStream(f);
                ){

            System.out.println("s1.hashCode() "+s1.hashCode());
            System.out.println("s2.hashCode() "+s2.hashCode());

            o.writeObject(s1);
            o.writeObject(s2);

            o.close();
            f.close();

        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
