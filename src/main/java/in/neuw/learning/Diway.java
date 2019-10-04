package in.neuw.learning;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karanbir Singh on 6/2/2019.
 **/
public class Diway {

    public static void main(String[] args) {

        long n = 20; // 1,2,4,5,10,20
        long p = 1;

        long initNumFactor = 1;
        List<Long> factorsList = new ArrayList<>();

        Long factors[] = new Long[]{};

        int arrayIndex = 0;

        while(initNumFactor <= n){
            if(n % initNumFactor == 0){
                factorsList.add(initNumFactor);
                factors[arrayIndex] = initNumFactor;
                arrayIndex++;
            }
            initNumFactor++;
        }

        if(p>factorsList.size()){
            System.out.println(0);
        }else {
            System.out.println(factorsList.get((int) p - 1));
        }

        System.out.println(factors);

    }

}
