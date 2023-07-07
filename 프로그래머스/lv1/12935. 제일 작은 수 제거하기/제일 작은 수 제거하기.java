class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length == 1 ? 1 : arr.length - 1;
        int[] answer = new int[length];
        int tmp = arr[0];
        int order = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < tmp) {
                tmp = arr[i];
                order = i;
            }
        }
        
        for(int i = 0, j = 0; i < arr.length; i++) {
            if(length == 1) answer[i] = -1;
            if(i != order) {
                answer[j] = arr[i];
                j++;
            }
        }
            
        return answer;
    }
}