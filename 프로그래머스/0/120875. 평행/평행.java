import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        List<Double> result = new ArrayList<>();
        
        for(int i = 0; i < dots.length; i++) {
            for(int j = i + 1; j < dots.length; j++) {
                result.add((double)(dots[j][1] - dots[i][1])
                       / (dots[j][0] - dots[i][0]));
            }
        }
    
        int answer = 0;
        while(result.size() > 0) {
            Double m1 = result.get(0);
            Double m2 = result.get(result.size() - 1);
            
            if(Double.compare(m1, m2) == 0) {
                answer = 1;
                break;
            } else {
                result.remove(0);
                result.remove(result.size() - 1);
            }
        }

        return answer;
    }
}