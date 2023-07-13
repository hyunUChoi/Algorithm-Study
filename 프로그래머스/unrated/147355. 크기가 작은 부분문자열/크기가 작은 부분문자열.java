class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        long pToLong = Long.parseLong(p);
        
        for(int i = 0; i < t.length() - pLength + 1; i++) {
            long tToLong = Long.parseLong(t.substring(i, pLength + i));
            if(tToLong <= pToLong) answer++;
        }
        
        return answer;
    }
}