class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        // int가 아닌 long으로 변환하는 이유
        // -> int는 최대 10자리까지 long은 최대 19자리까지 가능
        long pToLong = Long.parseLong(p);
        
        for(int i = 0; i < t.length() - pLength + 1; i++) {
            long tToLong = Long.parseLong(t.substring(i, pLength + i));
            if(tToLong <= pToLong) answer++;
        }
        
        return answer;
    }
}
