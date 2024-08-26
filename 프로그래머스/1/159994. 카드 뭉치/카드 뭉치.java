import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1, c2;
        c1 = c2 = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < goal.length; i++) {
            if(cards1[c1].equals(goal[i])) {
                sb.append(cards1[c1]);
                if(c1 < cards1.length - 1) {
                    c1++;
                }
            } else if(cards2[c2].equals(goal[i])) {
                sb.append(cards2[c2]);
                if(c2 < cards2.length - 1) {
                    c2++;
                }
            }
        }
        
        String join = String.join("", goal);
        
        return join.equals(sb.toString()) ? "Yes" : "No";
    }
}