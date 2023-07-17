class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < food.length; i++) {
            if(food[i] > 1) {
                for(int j = 0; j < food[i]/2; j++) {
                    answer += "" + i;
                    sb.append(i);
                }
            }
        }
        
        answer += "0" + sb.reverse().toString();
        
        return answer;
    }
}