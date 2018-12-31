package in.neuw.learning.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Karanbir Singh on 7/1/2017.
 **/
public class SerClass implements Serializable {

    private int a;

    private String b;

    private static final long serialVersionUID = 1123445124124L;

    public SerClass() {
    }

    public SerClass(int a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "SerClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SerClass serClass = (SerClass) o;

        if (a != serClass.a) return false;
        return b.equals(serClass.b);
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b.hashCode();
        return result;
    }

    private void writeObject(ObjectOutputStream os) throws Exception{
        // add extra code for encryption here
        os.defaultWriteObject();
        //os.writeObject(this);
    }

    private void readObject(ObjectInputStream in) throws Exception{
        // add extra code for de encryption here
        in.defaultReadObject();
    }

}