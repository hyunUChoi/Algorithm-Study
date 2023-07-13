class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++) {
            String tmp = "";
            for(int j = 0; j < n; j++) {
                char ch1 = binary(arr1[i], n).charAt(j);
                char ch2 = binary(arr2[i], n).charAt(j);
                tmp += (ch1 == '0' && ch2 == '0') ? ' ' : '#';
            }
            answer[i] = tmp;
        }
        
        return answer;
    }
    
    private static String binary(int x, int n) {
        StringBuilder sb = new StringBuilder();
        
        while(x > 0) {
            sb.append(x % 2);
            x /= 2;
        }
        
        int length = sb.length();
        while(n - length > 0) {
            sb.append("0");
            n--;
        }

        return sb.reverse().toString();
    }
}