class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int dvs = cntDvs(i);
            if(dvs > limit) {
                answer += power;
            } else {
                answer += dvs;
            }
        }
        return answer;
    }
    
    public int cntDvs(int num) {
        int cnt = 1;
        
        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) cnt++;
        }
        
        return cnt;
    }
}