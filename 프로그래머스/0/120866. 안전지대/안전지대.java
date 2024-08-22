import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int answer = 0;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                List<Integer> temp = new ArrayList<>();
   
                for(int k = - 1; k < 2; k++) {
                    for(int m = -1; m < 2; m++) {
                        try {
                            temp.add(board[i + k][j + m]);
                        } catch(Exception e) {
                            continue;
                        }
                    }
                }
                if(!temp.contains(1)) answer++;
            }
        }
        
        return answer;
    }
}