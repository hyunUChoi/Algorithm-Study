import java.util.*;

class Solution {
    /*
    // 기존방식
    public int[] solution(int k, int[] score) {
        int length = score.length;
        int[] tmp = new int[length];
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
            tmp[i] = score[i];
            int[] tmp2 = Arrays.copyOf(tmp, length);
            Arrays.sort(tmp2);
            answer[i] = (k - 1 > i) ? tmp2[length - i - 1] : tmp2[length - k];
        }
        
        return answer;
    }
    */
    
    // Queue 사용
    // Priority Queue : 우선순위큐로 일반적인 큐의 구조를 가지면서, 데이터가 들어온 순서대로 데이터가 나가는 것이 아닌
    //                  우선순위를 먼저 결정하고 그 우선순위가 높은 데이터가 먼저 나가는 자료구조
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            
            if(priorityQueue.size() > k) {
                // poll() : 첫번째 값을 반환하고 제거
                priorityQueue.poll();
            }
            
            answer[i] = priorityQueue.peek();
        }
        
        return answer;
    }
}