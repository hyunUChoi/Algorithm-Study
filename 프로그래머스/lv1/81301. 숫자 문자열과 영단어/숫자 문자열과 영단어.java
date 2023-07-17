import java.util.*;

class Solution {
    /*
    // Map 사용
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("");
        
        Map<String, Integer> number = new HashMap<>();
        number.put("zero", 0);
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);
        number.put("five", 5);
        number.put("six", 6);
        number.put("seven", 7);
        number.put("eight", 8);
        number.put("nine", 9);
        
        String tmp = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            tmp += "" + ch;
            if(number.get(tmp) == null) {
                if(ch < 'a') {
                    sb.append(ch);
                    tmp = "";
                }
            } else {
                sb.append(number.get(tmp));
                tmp = "";
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
    */
    
    // ReplaceAll 사용
    public int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < arr.length; i++) {
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}