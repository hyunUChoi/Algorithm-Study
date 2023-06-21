import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        
        int memory = 0;
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                for(String key : map.keySet()) {
                    if(key.equals(photo[i][j])) {
                        memory += map.get(key);
                    }
                }
            }
            answer[i] = memory;
            memory = 0;
        }
        return answer;
    }
}