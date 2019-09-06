import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        //K이상 - IF FOOD < K / 맨 뒤노드 + 맨 뒤-1 노드 
        int p1;
        int p2;
        int mix;
        Queue <Integer> pq = new PriorityQueue <Integer>();
        for(int a : scoville)
        {
            pq.offer(a);
        }
        
        while(pq.size() > 1)
        {
            p1 = pq.poll();
            p2 = pq.poll();
            
            if(p1 >= K)
                break;
            mix = p1 + (p2 * 2);
            pq.offer(mix);
            answer++;
        }
        //마지막한개 판별
        if(pq.size() == 1 )
        {
            p1 = pq.poll();
            if(p1 < K)
                return -1;
        }
        
        return answer;
    }
}