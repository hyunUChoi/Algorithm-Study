class Solution {
    /*
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                answer += "" + i;
                sb.append(i);
            }
        }

        answer += "0" + sb.reverse().toString();

        return answer;
    }
    */
    
    public String solution(int[] food) {
        String answer = "0";
        
        for(int i = food.length - 1; i >= 0; i--) {
            for(int j = 0; j < food[i]/2; j++) {
                answer = i + answer + i;
            }
        }
        
        return answer;
    }
}
