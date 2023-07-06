import java.util.*;

class Solution {
    /*
    // 삽입정렬 방식
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        
        // 삽입정렬
        for(int i = 1; i < list.size(); i++) {
            answer = list.get(i);
            for(int j = i - 1; j >= 0; j--) {
                if(list.get(j) > answer) {
                    Collections.swap(list, j+1, j);
                }
            }
        }
        
        // 역순정렬
        for(int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
    */
    
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        
        for(String s : arr) sb.append(s);
        
        return Long.parseLong(sb.reverse().toString());
    }
}