class Solution {
    public int[] solution(long n) {
        String number = Long.toString(n);
        int[] answer = new int[number.length()];
        while (n > 0) {
            for (int i = 0; i < answer.length; i++) {
                answer[i] += n % 10;
                n /= 10;
            }
        }
        return answer;
    }
}