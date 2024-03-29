import java.util.*;

public class Solution {
    /*public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }*/
    
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i : arr) {
            if(stack.isEmpty() || stack.peek() != i) {
                stack.push(i);
            }
        }
        
        int[] answer = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}