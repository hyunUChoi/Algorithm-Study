import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] temp = s.toCharArray();
        Integer[] list = new Integer[temp.length];
        
        for(int i = 0; i < temp.length; i++) {
            list[i] = (int) temp[i];
        }
        
        Arrays.sort(list, Collections.reverseOrder());
        
        for(int i : list){
            answer += (char) i;
        }
        
        return answer;
    }
}