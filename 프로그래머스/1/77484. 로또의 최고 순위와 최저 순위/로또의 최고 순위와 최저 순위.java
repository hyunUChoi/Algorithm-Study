import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = (int) Arrays.stream(lottos).filter(x -> x == 0).count();
        int win = (int) Arrays.stream(win_nums)
            .filter(x -> Arrays.stream(lottos).anyMatch(l -> l == x)).count();
        return new int[] {(7 - (win + zero) > 5 ? 6 : 7 - (win + zero)), (7 - win > 5 ? 6 : 7 - win)};
    }
}