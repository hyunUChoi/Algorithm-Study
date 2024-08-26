import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int a1, b1, c1;
        a1 = b1 = c1 = 0;

        for(int i = 0; i < answers.length; i++) {
            if(a[i % a.length] == answers[i]) a1++;
            if(b[i % b.length] == answers[i]) b1++;
            if(c[i % c.length] == answers[i]) c1++;
        }
        
        int max = Math.max(a1, Math.max(b1, c1));
        
        List<Integer> list = new ArrayList<>();
        if(max == a1) list.add(1);
        if(max == b1) list.add(2); 
        if(max == c1) list.add(3);
        
        return list.stream().mapToInt(x -> x).toArray();
    }
}