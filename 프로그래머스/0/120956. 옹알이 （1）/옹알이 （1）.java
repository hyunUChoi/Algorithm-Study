import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};
        int answer = babbling.length;
        
        for(int i = 0; i < babbling.length; i++) {
            for(String ex : possible) {
                if(babbling[i].indexOf(ex) > -1) {
                    babbling[i] = babbling[i].replace(ex, " ");
                }
            }
            babbling[i] = babbling[i].replace(" ", "");
        }
        
        babbling = Arrays.stream(babbling).filter(x -> !"".equals(x)).toArray(String[]::new);
        
        return answer - babbling.length;
    }
}