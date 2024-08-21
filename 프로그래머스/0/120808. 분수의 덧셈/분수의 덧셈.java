class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int divisor = 0;
        
        for(int i = 1; i <= Math.min(numer, denom); i += divisor) {
            if(numer % i == 0 && denom % i == 0) divisor = i;
        }
        
        return new int[] {numer / divisor, denom / divisor};
    }
}