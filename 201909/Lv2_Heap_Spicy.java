import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        //K�̻� - IF FOOD < K / �� �ڳ�� + �� ��-1 ��� 
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
        //�������Ѱ� �Ǻ�
        if(pq.size() == 1 )
        {
            p1 = pq.poll();
            if(p1 < K)
                return -1;
        }
        
        return answer;
    }
}