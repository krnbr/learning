package in.neuw.learning.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Karanbir Singh on 7/2/2017.
 **/
public class MainDeSerClass {

    public static void main(String[] args) {
        try(
                FileInputStream fs = new FileInputStream(new File("savedObjects.txt"));
                ObjectInputStream oi = new ObjectInputStream(fs);
        ){
            SerClass s1 = (SerClass) oi.readObject();
            SerClass s2 = (SerClass) oi.readObject();

            System.out.println("s1.hashCode() "+s1.hashCode());
            System.out.println("s2.hashCode() "+s2.hashCode());

        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
