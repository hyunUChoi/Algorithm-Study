class Solution {
    /*public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int tmp = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) tmp++;
            }
            answer += (tmp % 2 == 0) ? i : i * -1;
        }
        
        return answer;
    }*/
    
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            // 제곱수이면 약수가 홀수, 제곱수가 아니라면 짝수
            answer += (i % Math.sqrt(i) == 0) ? i * -1 : i;
        }
        
        return answer;
    }
}