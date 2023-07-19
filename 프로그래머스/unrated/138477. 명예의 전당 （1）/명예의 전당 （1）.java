import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int length = score.length;
        int[] tmp = new int[length];
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
            tmp[i] = score[i];
            int[] tmp2 = Arrays.copyOf(tmp, length);
            Arrays.sort(tmp2);
            answer[i] = (k - 1 > i) ? tmp2[length - i - 1] : tmp2[length - k];
        }
        
        return answer;
    }
}