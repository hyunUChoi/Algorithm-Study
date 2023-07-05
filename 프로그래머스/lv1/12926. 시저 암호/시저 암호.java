class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        
        // 알파벳 개수 = 26개
        for(char c : ch) {
            if(c != ' ') {
                // 대문자
                if(c <= 'Z') {
                    c += n;
                    if(c > 'Z') c -= 26;
                }
                // 소문자
                else {
                    c += n;
                    if(c > 'z') c -= 26;
                }
            }
            answer += c;
        }
        
        return answer;
    }
}