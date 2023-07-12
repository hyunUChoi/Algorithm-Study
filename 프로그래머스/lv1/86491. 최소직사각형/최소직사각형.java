import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        // 세로 길이가 더 큰 경우 인덱스 변경
        int tmp = 0;
        for(int i = 0; i < sizes.length; i++) {
            for(int j = 0; j < sizes[i].length; j++) {
                tmp = sizes[i][0];
                if(sizes[i][1] > sizes[i][0]) {
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = tmp;
                }
            }
        }
        
        int row = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] > row) {
                row = sizes[i][0];
            }
        }
        
        int col = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][1] > col) {
                col = sizes[i][1];
            }
        }
        
        return row * col;
    }
}