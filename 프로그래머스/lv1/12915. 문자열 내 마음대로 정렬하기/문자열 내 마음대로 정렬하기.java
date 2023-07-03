import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length; i++) {
            // 앞에 인덱스 글자를 붙이고 뒤에 문자열 붙이기 -> 같은 알파벳이면 정렬 시 사전 순
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        
        String[] answer = new String[strings.length];
        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }
        return answer;
    }
}