import java.util.*;

class Solution {
    /*
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int tmp = m - 1;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new); 
        Arrays.sort(arr, Collections.reverseOrder());
        
        while(tmp < score.length) {
            answer += arr[tmp] * m;
            tmp += m;
        }
        
        return answer;
    }
    */
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        for(int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}