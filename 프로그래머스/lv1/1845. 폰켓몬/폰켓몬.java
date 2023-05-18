import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int length = nums.length / 2;
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i : nums){
            if(!temp.contains(i)){
                temp.add(i);
            }
        }
        answer = length > temp.size() ? temp.size() : length;
        
        return answer;
    }
}