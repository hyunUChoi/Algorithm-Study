import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};
        int answer = 0;

        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < possible.length; j++) {
                if(babbling[i].indexOf(impossible[j]) > -1) {
                    babbling[i] = babbling[i].replace(impossible[j], "1");
                } else if(babbling[i].indexOf(possible[j]) > -1) {
                    babbling[i] = babbling[i].replace(possible[j], " ");
                }
            }
            babbling[i] = babbling[i].replace(" ", "");
        }
        
        return (int) Arrays.stream(babbling).filter(x -> "".equals(x)).count();
    }
}