package in.neuw.learning;

/**
 * Created by Karanbir Singh on 2/2/2019.
 **/
public class coditop1 {

    private String SAME = "SAME";
    private String REPLACE = "REPLACE";
    private String SWAP = "SWAP";
    private String INSERT = "INSERT";
    private String DELETE = "DELETE";
    private String IMPOSSIBLE = "IMPOSSIBLE";

    public String solution(String S, String T) {
        if(S.equals(T)){
            return SAME;
        }
        int N = S.length();
        int M = T.length();
        if(N == M){
            return checkSWAPorREPLACE(S, T);
        }else if(Math.abs(N-M) == 1){
            return checkINSERTorDELETE(S, T);
        }
        return IMPOSSIBLE;
    }

    private String checkSWAPorREPLACE(String S, String T){
        int i = 0; // or T.length since both are same
        boolean single = false;
        int index_first = 0;
        boolean twice = false;
        int index_second = 0;
        while(i<S.length()) { // or T.length since both are same
            if(S.charAt(i) != T.charAt(i)){
                // to check if this happened once or twice?
                if(single && index_first == (i - 1)){
                    index_second = i;
                    twice = true;
                }
                if(!single) {
                    index_first = i;
                    single = true;
                }
            }
            i++;
        }
        if(single && !twice){
            return REPLACE+" "+S.charAt(index_first)+" "+T.charAt(index_first);
        }else if(twice){
            return SWAP+" "+S.charAt(index_first)+" "+S.charAt(index_second);
        }
        return IMPOSSIBLE;
    }

    private String checkINSERTorDELETE(String S, String T){
        int N = S.length();
        int M = T.length();
        char[] S_ARR = S.toCharArray();
        char[] T_ARR = T.toCharArray();
        if(N-M == 1){ // delete
            int i = 0;
            int deleted_at = 0;
            while(i < N){
                if(deleted_at == 0 && i<M && S_ARR[i]!=T_ARR[i]){
                    deleted_at = i;
                }else if(deleted_at!=0 && S_ARR[i]!=T_ARR[i-1]){
                    return IMPOSSIBLE; // if characters after deletion were also altered
                }
                i++;
            }
            if (deleted_at!=0) {
                return DELETE + " " + S_ARR[deleted_at];
            }
        }else if(M-N == 1){ // insert
            int i = 0;
            int inserted_at = 0;
            while(i < M){
                if(inserted_at==0 && i<N && S_ARR[i]!=T_ARR[i]){
                    inserted_at = i; // inserted to T in between somewhere
                }else if(inserted_at==0 && i==M-1){
                    inserted_at = i; // inserted to T at the last
                }else if(inserted_at!=0 && S_ARR[i-1]!=T_ARR[i]){
                    return IMPOSSIBLE;
                }
                i++;
            }
            if (inserted_at!=0) {
                return INSERT + " " + T_ARR[inserted_at];
            }
        }
        return IMPOSSIBLE;
    }

    public static void main(String[] args) {
        coditop1 coditop1 = new coditop1();
        System.out.println(coditop1.solution("nice", "nice"));
        System.out.println(coditop1.solution("nice", "nicde"));
        System.out.println(coditop1.solution("nice", "ncie"));
        System.out.println(coditop1.solution("nice", "nise"));
        System.out.println(coditop1.solution("ince", "nice"));
        System.out.println(coditop1.solution("ince", "ice"));
        System.out.println(coditop1.solution("nice", "nicee"));
        System.out.println(coditop1.solution("nice", "niced"));
        System.out.println(coditop1.solution("nice", "nie"));
        System.out.println(coditop1.solution("nice", "ned"));
        System.out.println(coditop1.solution("nice", "ne"));
        System.out.println(coditop1.solution("nice", "ince"));
    }

}
