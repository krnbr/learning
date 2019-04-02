package in.neuw.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Karanbir Singh on 2/3/2019.
 **/
public class SoluCodi {

    public int solution(String[] words) {
        // write your code in Java SE 8
        List<String> list = Arrays.asList(words);
        Collections.sort(list);

        List<String> asc_list = new ArrayList<>(list);
        Collections.sort(list, Collections.reverseOrder());
        List<String> des_list = new ArrayList<>(list);

        String concat_asc = asc_list.stream().map(
                (s)->s
        ).collect(Collectors.joining(""));
        String concat_des = des_list.stream().map(
                        (s)->s
                ).collect(Collectors.joining(""));
        //System.out.println(concat_asc);
        //System.out.println(concat_des);

        return maxLen(concat_asc)>maxLen(concat_des)?maxLen(concat_asc):maxLen(concat_des);
    }

    public int maxLen(String input){
        int maxLen = 0;
        int tempLen = 0;
        char prevChar = 0;
        for(int i=0;i<input.length();i++){
            final char c =input.charAt(i);
            if(c == prevChar){
                tempLen++;
            }else{
                maxLen = (tempLen>maxLen)?tempLen:maxLen;
                prevChar = c;
                tempLen = 1;
            }
        }
        maxLen = (tempLen>maxLen)?tempLen:maxLen;
        return maxLen;
    }

    public static void main(String[] args) {
        SoluCodi soluCodi = new SoluCodi();

        System.out.println(soluCodi.solution(new String[]{"aa","ddbb","aaaccc"}));
        System.out.println(soluCodi.solution(new String[]{"dd","bb","cc","dd"}));
        System.out.println(soluCodi.solution(new String[]{"xxbxx","xbx","x"}));
        System.out.println(soluCodi.solution(new String[]{"aaxxxaa","xxxxxddbb","xxaaaccc","aaaaaaaaaaaaaxx"}));
    }

}
