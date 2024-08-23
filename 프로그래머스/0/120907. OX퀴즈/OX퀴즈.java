/* Stream 풀이 */
import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        return Arrays.stream(quiz)
            .map(s -> {
                String[] temp = s.split(" ");
                return Integer.valueOf(temp[4]) == Integer.valueOf(temp[0]) + ("-".equals(temp[1]) ? Integer.valueOf(temp[2]) * -1 : Integer.valueOf(temp[2])) ? "O" : "X";
            })
            .toArray(String[]::new);
    }
}

/*
 * 삼항연산자 풀이
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] temp = quiz[i].split(" ");
            answer[i] = Integer.valueOf(temp[4]) == Integer.valueOf(temp[0]) + ("-".equals(temp[1]) ? Integer.valueOf(temp[2]) * -1 : Integer.valueOf(temp[2])) ? "O" : "X";
        }
        
        return answer;
    }
}
*/

/*
 * 형변환 할때마다 하기 귀찮아
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            List<Integer> temp = new ArrayList<>();
            String operation = "";
            
            for(String s : quiz[i].split(" ")) {
                if("+".equals(s) || "-".equals(s)) {
                    operation = s;
                } else if(!"=".equals(s)) {
                    temp.add(Integer.valueOf(s));
                }
            }
            
            if("+".equals(operation)) {
                answer[i] = (temp.get(0) + temp.get(1) == temp.get(2) ? "O" : "X");
            } else {
                answer[i] = (temp.get(0) - temp.get(1) == temp.get(2) ? "O" : "X");
            }
            
        }
        
        return answer;
    }
}
*/