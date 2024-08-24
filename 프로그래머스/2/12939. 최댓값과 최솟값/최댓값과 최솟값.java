import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        List<Integer> list = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).boxed().sorted().collect(Collectors.toList());
        return list.get(0) + " " + list.get(list.size() - 1);
    }
}