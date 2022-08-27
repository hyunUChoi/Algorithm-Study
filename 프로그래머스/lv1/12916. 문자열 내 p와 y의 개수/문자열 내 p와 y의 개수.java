class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] array = s.split("");
        int p = 0;
        int y = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
            if (array[i].equals("p")) {
                p += 1;
            } else if (array[i].equals("y")) {
                y += 1;
            }
        }
        answer = (p == y) ? true : false;
        return answer;
    }
}