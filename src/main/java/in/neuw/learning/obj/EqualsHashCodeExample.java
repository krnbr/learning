package in.neuw.learning.obj;

/**
 * Created by Karanbir Singh on 6/23/2017.
 **/
public class EqualsHashCodeExample implements Cloneable {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        EqualsHashCodeExample equalsHashCodeExample = new EqualsHashCodeExample();
        EqualsHashCodeExample o = (EqualsHashCodeExample) equalsHashCodeExample.clone();
        System.out.println(equalsHashCodeExample.equals(o));
    }

}
