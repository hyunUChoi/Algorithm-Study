import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        // 알파벳 List
        List<String> alpha = IntStream.rangeClosed(97, 122).mapToObj(x -> String.valueOf((char) x)).collect(Collectors.toList());

        // skip 문자열 제거
        for(char ch : skip.toCharArray()) {
            alpha.remove(String.valueOf(ch));
        }
        
        char[] word = s.toCharArray();
        for(char ch : word) {
            int idx = alpha.indexOf(String.valueOf(ch)) + index;
            answer += alpha.get(idx >= alpha.size() ? (idx - alpha.size() >= alpha.size() ? idx - alpha.size() * 2 : idx - alpha.size()) : idx);
        }
        
        return answer;
    }
}