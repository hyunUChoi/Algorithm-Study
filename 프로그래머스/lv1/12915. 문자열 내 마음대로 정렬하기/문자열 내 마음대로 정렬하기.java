import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length; i++) {
            // 앞에 인덱스 글자를 붙이고 뒤에 문자열 붙이기 -> 같은 알파벳이면 정렬 시 사전 순
            strings[i] = strings[i].charAt(n) + strings[i];
        }
        Arrays.sort(strings);
        
        String[] answer = new String[strings.length];
        for(int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].substring(1);
        }
        return answer;
    }
}

/**
-- Map을 활용한 방법
class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, String> map = new HashMap<String, String>();
        
        for(String str : strings) {
            -- n번째 글자를 Key로 사용하지 않는 이유 : 같은 알파벳인 경우 Iterator에 의해 삭제됨
            map.put(str, str.charAt(n) + str);
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
**/
