class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] date = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int tmp = 0;
        
        for(int i = 0; i < a - 1; i++) {
            tmp += days[i];
        }
        tmp += b - 1;

        answer = date[tmp % 7];
        return answer;
    }
}