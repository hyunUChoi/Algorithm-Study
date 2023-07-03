import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {
        Stack<Integer> answer = new Stack<Integer>();
        
        for(int i : arr) {
            if(answer.isEmpty() || answer.peek() != i) {
                answer.push(i);
            }
        }

        return answer;
    }
}