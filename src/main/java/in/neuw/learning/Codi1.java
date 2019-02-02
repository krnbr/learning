package in.neuw.learning;

import java.util.*;

/**
 * Created by Karanbir Singh on 2/2/2019.
 **/
public class Codi1 {

    public int solution(int[] A){
        /*int result = 1;
        int first_num = A[0];
        int second_num = A[A.length - 1];
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        System.out.println(min +" "+ max);
        if(first_num>0 && second_num>0){

        }
        return result;*/
        Set<Integer> set = new HashSet<>();
        int A_LENGTH = A.length;
        for (int e : A) {
            if (e > 0) {
                set.add(e);
            }
        }
        for (int i = 1; i <= A_LENGTH + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Codi1 codi1 = new Codi1();
        System.out.println(codi1.solution(new int[]{1,2,3}));
        System.out.println(codi1.solution(new int[]{0,-1,4}));
        System.out.println(codi1.solution(new int[]{0,5,4}));
    }

}
