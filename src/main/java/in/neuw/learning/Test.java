package in.neuw.learning;

import java.util.*;

/**
 * Created by Karanbir Singh on 12/29/2016.
 **/
public class Test {

    public static void main(String[] args) throws Exception {
 //       Long[] l = new Long[Integer.MAX_VALUE];

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        map.put(5,"e");

        for (Map.Entry<Integer,String> entry : map.entrySet()) {

        }

        List<String> list = new ArrayList<>();

        list.stream();

        int ints [][] = new int[3][];
        ints [1] = new int[]{1,2,3};
        ints [2] = new int[]{4,5};

        System.out.println(ints[1][1]);

        int []intks = new int[0b101];

        System.out.println("intks.lenght "+intks.length);

        for (int i:intks) {
            System.out.println(i);
        }

        String strings [][] = new String[][]{{"A","Z"},{"C","D","S"},{"L"}};
        //Arrays.sort(strings); ClassCastException
        for (String [] s:strings) {
            for (String s2 : s)
            System.out.print(s2);
        }

        Object o = new Double(3.0);
        Number n = (Number) o;
        System.out.println(n);

    }


}
