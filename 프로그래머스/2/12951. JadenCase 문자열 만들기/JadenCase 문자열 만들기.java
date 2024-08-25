import java.util.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        for(char ch : s.toCharArray()) {
            if(ch == ' ') {
                sb.append(ch);
                i = 0;
            } else {
                i += 1;
            }
            
            if(ch != ' ' && i == 1) {
                sb.append(Character.toUpperCase(ch));
            } else if(ch != ' ') {
                sb.append(ch);
            }
                
        }
        
        return sb.toString();
    }
}