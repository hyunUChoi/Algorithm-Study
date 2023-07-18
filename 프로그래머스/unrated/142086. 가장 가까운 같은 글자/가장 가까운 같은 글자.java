class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            if(sb.indexOf(arr[i]) == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - sb.lastIndexOf(arr[i]);
            }
            sb.append(arr[i]);
        }
        
        return answer;
    }
}