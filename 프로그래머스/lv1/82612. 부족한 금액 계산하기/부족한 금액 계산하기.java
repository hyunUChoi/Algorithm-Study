class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        long fare = 0;
        for (int i = 1; i <= count; i++) {
            fare += price * i;
        }
        answer = (fare - money > 0) ? fare - money : 0;
        return answer;
    }
}