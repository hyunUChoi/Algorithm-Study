import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 1) {
                list.add(i);
            }
        }
        
        return list.get(0);
    }
}