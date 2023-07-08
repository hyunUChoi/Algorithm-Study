class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int tmp = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) tmp++;
            }
            answer += (tmp % 2 == 0) ? i : i * -1;
        }
        
        return answer;
    }
}