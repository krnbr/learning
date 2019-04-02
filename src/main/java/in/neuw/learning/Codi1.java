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
        //System.out.println(codi1.solution(new int[]{1,2,3}));
        //System.out.println(codi1.solution(new int[]{0,-1,4}));
        //System.out.println(codi1.solution(new int[]{0,5,4}));
        //System.out.println(codi1.solutionR(new int[]{0,1,2,3,4,5,0,5,4}));
        //System.out.println(codi1.solutionR(new int[]{3, 4, 3, 0, 2, 2, 3, 0, 0}));

        System.out.println(solution("abbabba"));
    }

    public int solutionR(int[] ranks) {
        Map<Integer, Integer> m = new HashMap();
        for(int r: ranks){
            if(m.containsKey(r)) {
                m.put(r, m.get(r)+1);
            } else {
                m.put(r, 1);
            }
        }

        //System.out.println(m);

        TreeMap<Integer, Integer> sorted = new TreeMap<>(m);

        int result = 0;

        //System.out.println(sorted);

        for(Integer r : sorted.keySet()){
            if (sorted.get(r+1)!=null){
                result = result + sorted.get(r);
            }
        }

        return result;
    }

    public static int solution(String S) {
        if (S == null) {
            return 0;
        }

        Set<String> set = new HashSet<>();

        int len = S.length();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < len - 1; i++) {
            stringBuilder.append(S.charAt(i));
            set.add(stringBuilder.toString());
        }

        System.out.println(set);

        int max = 0;

        for (int i = 1; i < len; i++) {
            String suffix = S.substring(i, len);
            if (set.contains(suffix)) {
                int suff_len = suffix.length();
                if (suff_len > max) {
                    max = suff_len;
                }
            }
        }
        return max;
    }

}
