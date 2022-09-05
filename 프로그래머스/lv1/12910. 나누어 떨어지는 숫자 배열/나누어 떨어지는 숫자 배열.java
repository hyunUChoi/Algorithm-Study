import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                    length++;
                }
            }
        if (length >= 1) {
            answer = new int[length];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                    answer[length - 1] = arr[i];
                    length--;
                }
            }
        Arrays.sort(answer);
        return answer;
    }
}