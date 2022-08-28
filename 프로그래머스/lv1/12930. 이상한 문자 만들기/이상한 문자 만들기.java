class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split(" ", -1);
        String temp = "";
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            for (int j = 0; j < temp.length(); j++) {
                if (j % 2 == 0) {
                    answer += (temp.charAt(j) + "").toUpperCase();
                } else {
                    answer += (temp.charAt(j) + "").toLowerCase();
                }
            }
            if (array.length - 1 == i){
                break;
            } else {
                answer += " ";
            }
        }
        return answer;
    }
}