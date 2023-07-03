import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, String> map = new HashMap<String, String>();
        
        for(String str : strings) {
            map.put(str, str.charAt(n)+str);
        }
        
        List<String> list = new ArrayList<>(map.values());
        list.sort(String::compareTo);
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = getKey(map, list.get(i));
        }
        
        return answer;
    }
    
    public static <K, V> K getKey(Map<K, V> map, V value) {
        for(K key : map.keySet()) {
            if(value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}