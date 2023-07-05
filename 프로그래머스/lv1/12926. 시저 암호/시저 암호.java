class Solution {
    /*
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
    */
    
    /*
    * 속도 개선
    */
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            
            if(ch != 32) {
                if(ch <= 90) {
                    ch += n;
                    if(ch > 90) ch -= 26;
                } else {
                    ch += n;
                    if(ch > 122) ch -= 26;
                }
            }
             answer.append((char) ch);
        }
        
        return answer.toString();
    }
}