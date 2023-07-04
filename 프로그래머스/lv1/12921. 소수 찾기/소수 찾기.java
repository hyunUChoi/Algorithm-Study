class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        
        for(int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        
        for(int i = 2; i <= n; i++) {
            // 각 배수를 삭제
            for(int j = 2 * i; j <= n; j += i) {
                arr[j] = 0;
            }
        }
        
        for(int i : arr) {
            if(i != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}