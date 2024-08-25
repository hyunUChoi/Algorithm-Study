import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }   
        
        /* 
         * 효율성 실패
        Arrays.sort(A);
        B = Arrays.stream(B).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }
         */
        return answer;
    }
}