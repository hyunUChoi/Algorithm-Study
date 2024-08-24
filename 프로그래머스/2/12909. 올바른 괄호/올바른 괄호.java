import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char str : s.toCharArray()) {
            if(stack.isEmpty()) {
                stack.add(str);
                continue;
            }
            
            if('(' == stack.peek() && ')' == str) {
                stack.pop();
            } else {
                stack.add(str);
            }
        }
        
        return stack.isEmpty();
    }
}