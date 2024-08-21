import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        List<Integer> roll = new ArrayList<>(Arrays.asList(a, b, c, d));
        List<Integer> distinct = roll.stream().distinct().collect(Collectors.toList());
        
        for(int i : distinct) {
            // 특정 값을 지우려면 Object 형태로 보내줘야함
            roll.remove(Integer.valueOf(i));
        }
        
        int size = roll.size();
        if(size == 3) {
            answer = roll.get(0) * 1111;
            
        } else if(size == 2) {
            if(roll.get(0) == roll.get(1)) {
                int q = distinct.get(roll.get(0) == distinct.get(0) ? 1 : 0);
                answer = (int) Math.pow(10 * roll.get(0) + q, 2);
            } else {
                answer = (roll.get(0) + roll.get(1)) * Math.abs(roll.get(0) - roll.get(1));
            }
            
        } else if(size == 1) {
            distinct.remove(Integer.valueOf(roll.get(0)));
            answer = distinct.get(0) * distinct.get(1);
            
        } else {
            answer = distinct.stream().mapToInt(x -> x).min().getAsInt();
        }

        return answer;
    }
}