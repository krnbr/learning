package in.neuw.learning.array;

/**
 * Created by Karanbir Singh on 2/4/2019.
 **/
public class Runner {

    static int[] reverse(int[] A){
        int[] R = new int[A.length];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < A.length; i++){
            R[A.length-i-1] = A[i];

            result.append(R[A.length-i-1]);
            if(i!=A.length-1)
            result.append(" ");
        }
        System.out.print(result);
        return R;
    }

    static long arrayMan(int n, int[][] queries) {
        long[] array_sum = new long[n];

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0] - 1;
            int b = queries[i][1] - 1;
            int k = queries[i][2];

            array_sum[a] += k;
            if (b + 1 < n ) {
                array_sum[b + 1] -= k;
            }
        }

        long max = 0; long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array_sum[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    static long arrayManipulation(int n, int[][] queries) {

        int[] zero_array = new int[n];

        long max = Long.MIN_VALUE;
        for(int i = 0; i<queries.length ; i++){
            int[] query = queries[i];
            int a = query[0];
            int b = query[1];
            int k = query[2];
            for(int j=a;j<=b;j++){
                zero_array[j-1] = zero_array[j-1] + k;
                max = Math.max(zero_array[j-1],max);
            }
        }

        /*for (int t:zero_array) {
            System.out.println(t);
        }*/

        return max;

    }

    public static void main(String[] args) {
        //int[] R = reverse(new int[]{4,2,3,1});
        System.out.println("MAAAAAAX");
        System.out.println(arrayManipulation(10^7,
                new int[][]{
                        {1,10,3},
                        {4,10^7,123},
                        {6,9,1}
                }));
    }

}
