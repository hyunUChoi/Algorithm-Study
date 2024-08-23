import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((e1, e2) -> map.get(e2).compareTo(map.get(e1)));

        if(list.size() == 1) {
            answer = list.get(0);
        } else {
            if(map.get(list.get(0)) == map.get(list.get(1))) {
                answer = -1;
            } else {
                answer = list.get(0);
            }
        }
        
        return answer;
    }
}